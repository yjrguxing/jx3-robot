package com.jx3robot.robot.util;

import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.util.Date;

public enum TimeUtil {

    // 枚举对象实例
    Singleton;

    /**
     * 获取时间差
     * 要求时间格式为 yyyy-MM-dd
     * @param time 第一个时间
     * @param nextTime 第二个时间
     * @return 相差时间戳
     */
    @SneakyThrows
    public Long getTimeDiff(String time, String nextTime){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(time);
        Date nextDate = simpleDateFormat.parse(nextTime);
        if(date.getTime() > nextDate.getTime()){
            return date.getTime() - nextDate.getTime();
        }
        return nextDate.getTime() - date.getTime();
    }
    /**
     * 获取时间差
     * 要求时间格式为 yyyy-MM-dd
     * @param time 第一个时间
     * @param nextTime 第二个时间
     * @return 相差时间戳
     */
    @SneakyThrows
    public Long getTimeDiff(long time, long nextTime){
        if(time > nextTime){
            return time - nextTime;
        }
        return time - nextTime;
    }

    /**
     * 将特定格式时间转为时间戳<br/>
     * @param
     * @author psyduck
     * @date 2022/4/23 22:03
     * @return java.lang.Long
     */
    @SneakyThrows
    public Long timeToTimeStamp(String time, String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        long timeStamp = simpleDateFormat.parse(time).getTime();
        return timeStamp;
    }

    /**
     * 时间戳转天
     * @param timeStamp 时间戳
     * @return 天数
     */
    public String timeStampToDay(Long timeStamp){
        return String.valueOf(timeStamp/1000/3600/24);
    }
}
