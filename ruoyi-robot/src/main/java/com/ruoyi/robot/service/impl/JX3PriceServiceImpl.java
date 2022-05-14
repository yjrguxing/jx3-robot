package com.ruoyi.robot.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruoyi.robot.dao.JX3PriceDao;
import com.ruoyi.robot.entity.JX3Price;
import com.ruoyi.robot.service.JX3PriceService;
import lombok.SneakyThrows;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author psyduck
 * @Date 2022/5/8 19:23
 * @see
 * @version 1.0
 **/
@Service
public class JX3PriceServiceImpl implements JX3PriceService {

    private final JX3PriceDao dao;

    @Autowired
    public JX3PriceServiceImpl(JX3PriceDao dao){
        this.dao = dao;
    }

    @Override
    public String getPrice() {
        return dao.getPrice();
    }

    /**
     * 金价查询通用方法<br/>
     * @param serviceName 服务器名称
     * @author psyduck
     * @date 2022/5/14 15:26
     * @return love.forte.simbot.message.Message
     */
    @Override
    @SneakyThrows
    public Message priceCommon(String serviceName) {
        //获取结果
        String result = getPrice();
        //结果转实体类
        ObjectMapper mapper = new ObjectMapper();
        JsonNode resultNode = mapper.readTree(result);
        //获得金价数据集
        JsonNode dataNode = resultNode.get("data");
        HashMap<String, JX3Price> jx3PriceHashMap = new HashMap<>();

        Iterator<Map.Entry<String, JsonNode>> fields = dataNode.fields();
        while (fields.hasNext()){
            Map.Entry<String, JsonNode> node = fields.next();
            String key = node.getKey();
            JX3Price jx3Price = JX3Price.builder()
                    .price5173(mapper.treeToValue(node.getValue().get("today").get("5173"), String[].class))
                    .official(mapper.treeToValue(node.getValue().get("today").get("official"), String[].class))
                    .post(mapper.treeToValue(node.getValue().get("today").get("post"), String[].class))
                    .build();
            jx3PriceHashMap.put(key,jx3Price);
        }

        //实体类信息拼装为Message
        String msg = "";
        JX3Price jx3Price = jx3PriceHashMap.get(serviceName);
        if(null == jx3Price){
            msg = "请确认服务器名称正确哦！";
            return Text.of(msg);
        }

        // 5173金价处理
        BigDecimal averagedPrice5173 = new BigDecimal(0);
        if(jx3Price.getPrice5173().length > 0){
            for(String price5173:jx3Price.getPrice5173()){
                averagedPrice5173 = averagedPrice5173.add(new BigDecimal(new Integer(price5173)));
            }
            averagedPrice5173 = averagedPrice5173.divide(new BigDecimal(jx3Price.getPrice5173().length), 2, RoundingMode.HALF_UP);
        }
        if(averagedPrice5173.compareTo(BigDecimal.ZERO) == 0){
            msg += "5173 :无数据 ";
        }else{
            msg += "5173: " + averagedPrice5173 + " ";
        }

        // 贴吧金价处理
        BigDecimal averagedPricePost = new BigDecimal(0);
        if(jx3Price.getPost().length > 0){
            for(String pricePost:jx3Price.getPost()){
                averagedPricePost = averagedPricePost.add(new BigDecimal(new Integer(pricePost)));
            }
            averagedPricePost = averagedPricePost.divide(new BigDecimal(jx3Price.getPost().length), 2 , RoundingMode.HALF_UP);
        }
        if(averagedPricePost.compareTo(BigDecimal.ZERO) == 0){
            msg += "贴吧: 无数据 ";
        }else{
            msg += "贴吧: " + averagedPricePost + " ";
        }

        // 万宝楼金价处理
        BigDecimal averagedPriceOfficial = new BigDecimal(0);
        if(jx3Price.getOfficial().length > 0){
            for(String priceOfficial:jx3Price.getOfficial()){
                averagedPriceOfficial = averagedPriceOfficial.add(new BigDecimal(new Integer(priceOfficial)));
            }
            averagedPriceOfficial = averagedPriceOfficial.divide(new BigDecimal(jx3Price.getOfficial().length), 2 , RoundingMode.HALF_UP);
        }
        if(averagedPriceOfficial.compareTo(BigDecimal.ZERO) == 0){
            msg += "万宝楼 :无数据 ";
        }else{
            msg += "万宝楼 :" + averagedPriceOfficial + " ";
        }
        return Text.of(msg);
    }
}
