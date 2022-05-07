package com.ruoyi.robot.service;

import com.ruoyi.robot.entity.JX3Item;
import com.ruoyi.robot.mapper.JX3ItemMapper;
import com.ruoyi.robot.util.Const;
import com.ruoyi.robot.util.TimeUtil;
import love.forte.simbot.action.SendSupport;
import love.forte.simbot.component.mirai.event.MiraiEvent;
import love.forte.simbot.message.Message;
import love.forte.simbot.message.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * 群信息业务逻辑层
 * @author psyduck
 * @Date 2022/4/17 16:36
 * @see
 * @version 1.0
 **/
@Service
public class JX3ItemServiceImpl implements JX3ItemService {

    private final JX3ItemMapper mapper;

    @Autowired
    public JX3ItemServiceImpl(JX3ItemMapper jx3ItemMapper){
        this.mapper = jx3ItemMapper;
    }
    /**
     * 获取物品到期时间<br/>
     * @param goodName 物品名称
     * @author psyduck
     * @date 2022/4/17 16:38
     * @return java.lang.String
     */
    @Override
    public JX3Item getGoodExpTime(String goodName){
        return mapper.getGoodExpTime(goodName);
    }

    /**
     * 获取所有物品到期时间<br/>
     * @author psyduck
     * @date 2022/4/23 21:46
     * @return java.util.List<java.lang.String>
     */
    @Override
    public List<JX3Item> getAllGoodExpTime() {
        return mapper.getAllGoodExpTime();
    }

    @Override
    public Message goodExpTimeCommon(String goodName) {
        // 具体物品
        JX3Item jx3Item = getGoodExpTime(goodName);
        // 到期时间
        String goodExpTime = null;
        // 物品非空判断
        if(jx3Item == null){
            Text text = Text.of(goodName + "暂未收录，请联系" + Const.AdminInfo.PSYDUCK.getName() + "手动录入数据");
            return text;
        }else{
            goodExpTime = jx3Item.getExpTime();
        }
        // 判断到期范围是否是区间
        if(goodExpTime.contains("/")){
            String[] expTimeSplit = goodExpTime.split("/");
            // 判断该物品是否全部到期
            if(TimeUtil.Singleton.timeToTimeStamp(expTimeSplit[1],"yyyy-MM-dd") < System.currentTimeMillis()){
                return null;
            } else {
                Text text = null;
                // 判断该物品是否部分到期
                if(TimeUtil.Singleton.timeToTimeStamp(expTimeSplit[0],"yyyy-MM-dd") < System.currentTimeMillis()){
                    Long expTime = TimeUtil.Singleton.timeToTimeStamp(expTimeSplit[1], "yyyy-MM-dd");
                    Long timeDiff = TimeUtil.Singleton.getTimeDiff(expTime, System.currentTimeMillis());
                    String expDay = TimeUtil.Singleton.timeStampToDay(timeDiff);
                    if("0".equals(expDay)){
                        text = Text.of(goodName + "到期时间为:" + goodExpTime + ",大部分玩家已经到期，今天为此道具到期时间最后一天，请大家各自注意！");
                    }else{
                        text = Text.of(goodName + "到期时间为:" + goodExpTime + ",部分玩家已经到期,最迟到期时间为" + expDay + "天后!");
                    }
                }else{
                    Long firstExpTime = TimeUtil.Singleton.timeToTimeStamp(expTimeSplit[0], "yyyy-MM-dd");
                    Long firstTimeDiff = TimeUtil.Singleton.getTimeDiff(firstExpTime, System.currentTimeMillis());
                    String firstExpDay = TimeUtil.Singleton.timeStampToDay(firstTimeDiff);

                    Long lastExpTime = TimeUtil.Singleton.timeToTimeStamp(expTimeSplit[1], "yyyy-MM-dd");
                    Long lastTimeDiff = TimeUtil.Singleton.getTimeDiff(lastExpTime, System.currentTimeMillis());
                    String lastExpDay = TimeUtil.Singleton.timeStampToDay(lastTimeDiff);
                    if("0".equals(firstExpDay)){
                        text = Text.of(goodName + "到期时间为:" + goodExpTime + "最早将在今天到期，最迟将在" + lastExpDay + "天后到期!");
                    }else{
                        text = Text.of(goodName + "到期时间为:" + goodExpTime + ",最早将在" + firstExpDay + "天后到期,最迟将在" + lastExpDay + "天后到期!");
                    }
                }
                return text;
            }
        }else{
            // 判断物品是否已经到期
            if(TimeUtil.Singleton.timeToTimeStamp(goodExpTime,"yyyy-MM-dd") < System.currentTimeMillis()){
                return null;
            }else {
                Text text = null;
                Long expTime = TimeUtil.Singleton.timeToTimeStamp(goodExpTime, "yyyy-MM-dd");
                Long timeDiff = TimeUtil.Singleton.getTimeDiff(expTime, System.currentTimeMillis());
                String expDay = TimeUtil.Singleton.timeStampToDay(timeDiff);
                if("0".equals(expDay)){
                    text = Text.of(goodName + "到期时间为:" + goodExpTime + ",将在今天晚些时候到期");
                }else{
                    text = Text.of(goodName + "到期时间为:" + goodExpTime + ",将在"+ expDay +"天后到期");
                }
                return text;
            }
        }
    }
}
