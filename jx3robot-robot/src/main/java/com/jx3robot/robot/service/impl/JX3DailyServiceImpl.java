package com.jx3robot.robot.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jx3robot.robot.dao.JX3DailyDao;
import com.jx3robot.robot.entity.JX3Daily;
import com.jx3robot.robot.service.JX3DailyService;
import lombok.SneakyThrows;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author psyduck
 * @Date 2022/5/8 19:23
 * @see
 * @version 1.0
 **/
@Service
public class JX3DailyServiceImpl implements JX3DailyService {

    private final JX3DailyDao dao;

    @Autowired
    public JX3DailyServiceImpl(JX3DailyDao dao){
        this.dao = dao;
    }

    @Override
    public String getDaily(String date) {
        return dao.getDaily(date);
    }

    @Override
    @SneakyThrows
    public Message dailyCommon(String date) {
        //获取结果
        String result = getDaily(date);
        //结果转实体类
        ObjectMapper mapper = new ObjectMapper();
        JsonNode resultNode = mapper.readTree(result);
        if((!"Success".equals(resultNode.get("msg").textValue())) || null == resultNode.get("data")){
            return null;
        }
        JsonNode dataNode = resultNode.get("data");
        ArrayList<JX3Daily> jx3Dailies = new ArrayList<>();
        for(JsonNode node:dataNode){
            JX3Daily daily = mapper.treeToValue(node, JX3Daily.class);
            jx3Dailies.add(daily);
        }

        //实体类信息拼装为Message
        String msg = "";
        for(JX3Daily daily:jx3Dailies){
            msg += "【" + daily.getTask_type() + "】 " + daily.getActivity_name() + "\n";
        }
        return Text.of(msg);
    }
}
