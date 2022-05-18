package com.ruoyi.robot.util;

import love.forte.simbot.BotManager;
import love.forte.simbot.OriginBotManager;
import love.forte.simbot.component.mirai.MiraiBotManager;

import java.util.HashMap;

/**
 * 常量类
 * @author psyduck
 * @Date 2022/4/23 21:19
 * @see
 * @version 1.0
 **/
public final class Const {
    /**
     * 通用HashMap
     * @author psyduck
     * @Date 2022/5/15 15:37
     * @see
     * @version 1.0
     **/
    public static class CommonHashMap{
        // 用来记录心法IconId 和 心法名称对应的HashMap
        public static final HashMap<String,String> bpsHashMap = new HashMap<>();
        static {
            // 冰心
            bpsHashMap.put("冰心","10081");
            // 奶秀
            // 花间
            bpsHashMap.put("花间","10021");
            bpsHashMap.put("花间游","10021");
            // 奶花
            // 毒经
            bpsHashMap.put("毒经","10175");
            bpsHashMap.put("五毒","10175");
            // 奶毒
            // 莫问
            bpsHashMap.put("莫问","10447");
            bpsHashMap.put("长歌","10447");
            // 相知
            // 无方
            bpsHashMap.put("无方","10627");
            bpsHashMap.put("药宗","10627");
            // 灵素
            // 傲血战意
            bpsHashMap.put("傲血","10026");
            bpsHashMap.put("傲血战意","10026");
            bpsHashMap.put("天策","10026");
            // 铁牢律
            bpsHashMap.put("策T","10062");
            bpsHashMap.put("铁牢","10062");
            bpsHashMap.put("铁牢律","10062");
            // 易筋经
            bpsHashMap.put("易筋经","10003");
            bpsHashMap.put("易筋","10003");
            bpsHashMap.put("大师","10003");
            bpsHashMap.put("和尚","10003");
            bpsHashMap.put("少林","10003");
            bpsHashMap.put("秃驴","10003");
            // 洗髓经
            bpsHashMap.put("洗髓经","10002");
            // 焚影圣诀
            bpsHashMap.put("焚影","10242");
            bpsHashMap.put("焚影圣诀","10242");
            // 明尊琉璃体
            bpsHashMap.put("明尊","10243");
            bpsHashMap.put("喵T","10243");
            // 分山劲
            bpsHashMap.put("苍云,","10390");
            bpsHashMap.put("分山","10390");
            bpsHashMap.put("分山劲","10390");
            // 铁骨衣
            bpsHashMap.put("铁骨","10389");
            bpsHashMap.put("苍云T","10389");
            // 紫霞功
            bpsHashMap.put("紫霞功","10014");
            bpsHashMap.put("气纯","10014");
            // 太虚剑意
            bpsHashMap.put("太虚剑意","10015");
            bpsHashMap.put("剑纯","10015");
            // 惊羽诀
            bpsHashMap.put("鲸鱼","10224");
            bpsHashMap.put("惊羽","10224");
            bpsHashMap.put("惊羽诀","10224");
            // 天罗诡道
            bpsHashMap.put("田螺","10225");
            bpsHashMap.put("天罗诡道","10225");
            // 藏剑
            bpsHashMap.put("藏剑","10144");
            // 丐帮
            bpsHashMap.put("丐帮","10268");
            // 霸刀
            bpsHashMap.put("霸刀","10464");
            // 蓬莱
            bpsHashMap.put("蓬莱","10533");
            // 凌雪阁
            bpsHashMap.put("凌雪阁","10585");
            // 演员
            bpsHashMap.put("衍天宗","10615");
            bpsHashMap.put("演员","10615");
        }
        public CommonHashMap(){
            // 冰心
            bpsHashMap.put("冰心","10081");
            // 奶秀
            // 花间
            bpsHashMap.put("花间","10021");
            bpsHashMap.put("花间游","10021");
            // 奶花
            // 毒经
            bpsHashMap.put("毒经","10175");
            bpsHashMap.put("五毒","10175");
            // 奶毒
            // 莫问
            bpsHashMap.put("莫问","10447");
            bpsHashMap.put("长歌","10447");
            // 相知
            // 无方
            bpsHashMap.put("无方","10627");
            bpsHashMap.put("药宗","10627");
            // 灵素
            // 傲血战意
            bpsHashMap.put("傲血","10026");
            bpsHashMap.put("傲血战意","10026");
            bpsHashMap.put("天策","10026");
            // 铁牢律
            bpsHashMap.put("策T","10062");
            bpsHashMap.put("铁牢","10062");
            bpsHashMap.put("铁牢律","10062");
            // 易筋经
            bpsHashMap.put("易筋经","10003");
            bpsHashMap.put("易筋","10003");
            bpsHashMap.put("大师","10003");
            bpsHashMap.put("和尚","10003");
            bpsHashMap.put("少林","10003");
            bpsHashMap.put("秃驴","10003");
            // 洗髓经
            bpsHashMap.put("洗髓经","10002");
            // 焚影圣诀
            bpsHashMap.put("焚影","10242");
            bpsHashMap.put("焚影圣诀","10242");
            // 明尊琉璃体
            bpsHashMap.put("明尊","10243");
            bpsHashMap.put("喵T","10243");
            // 分山劲
            bpsHashMap.put("苍云,","10390");
            bpsHashMap.put("分山","10390");
            bpsHashMap.put("分山劲","10390");
            // 铁骨衣
            bpsHashMap.put("铁骨","10389");
            bpsHashMap.put("苍云T","10389");
            // 紫霞功
            bpsHashMap.put("紫霞功","10014");
            bpsHashMap.put("气纯","10014");
            // 太虚剑意
            bpsHashMap.put("太虚剑意","10015");
            bpsHashMap.put("剑纯","10015");
            // 惊羽诀
            bpsHashMap.put("鲸鱼","10224");
            bpsHashMap.put("惊羽","10224");
            bpsHashMap.put("惊羽诀","10224");
            // 天罗诡道
            bpsHashMap.put("田螺","10225");
            bpsHashMap.put("天罗诡道","10225");
            // 藏剑
            bpsHashMap.put("藏剑","10144");
            // 丐帮
            bpsHashMap.put("丐帮","10268");
            // 霸刀
            bpsHashMap.put("霸刀","10464");
            // 蓬莱
            bpsHashMap.put("蓬莱","10533");
            // 凌雪阁
            bpsHashMap.put("凌雪阁","10585");
            // 演员
            bpsHashMap.put("衍天宗","10615");
            bpsHashMap.put("演员","10615");
        }
    }
    /**
     * 管理请求的地址
     * @author psyduck
     * @Date 2022/5/8 20:58
     * @see
     * @version 1.0
     **/
    public enum URIConfig{
        // 获取剑三日常的接口地址
        JX3Daily("https://cms.jx3box.com/api/cms/game/daily","获取剑三日常的地址");

        private String url;
        private String description;

        URIConfig(String url, String description) {
            this.url = url;
            this.description = description;
        }

        public String getUrl() {
            return url;
        }

        public String getDescription() {
            return description;
        }
    }
    /**
     * 定时任务相关设置
     * @author psyduck
     * @Date 2022/5/8 16:19
     * @see
     * @version 1.0
     **/
    public enum ScheduledInfo{
        // 定时任务相关设置
        // 每天早上7点运行一次
        JX3ITEMEXPSCHEDULEDTASK(1,"剑三物品到期提醒定时任务","0 0 7 * * ? ");
        private final Integer code;
        private final String description;
        private final String cron;

        ScheduledInfo(Integer code, String description, String cron) {
            this.code = code;
            this.description = description;
            this.cron = cron;
        }

        public Integer getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }

        public String getCron() {
            return cron;
        }
    }

    public enum AdminInfo{
        // 定义管理员信息
        PSYDUCK(1,"可达鸭");

        private Integer code;
        private String name;

        AdminInfo(int code, String name){
            this.code = code;
            this.name = name;
        }

        public int getCode(){
            return code;
        }

        public String getName(){
            return name;
        }
    }
    /**
     * 定义剑三物品模块的相关常量
     * @author psyduck
     * @Date 2022/4/23 21:19
     * @see
     * @version 1.0
     **/
    public enum JX3ItemConst{
        // 定义物品剩余多少天到期时进行提醒
        REMINDTIME(3);

        /**
         * 枚举对应的实际值
         */
        private Integer code;

        JX3ItemConst(int code) {
            this.code = code;
        }

        public int getCode(){
            return code;
        }
    }

    public enum MiraiBotManage{
        // 实例
        INSTANCE;

        private MiraiBotManager botManage;

        public MiraiBotManager getMiraiBotManage(){
            if(botManage == null){
                synchronized (MiraiBotManage.class){
                    if(botManage == null){
                        for (BotManager<?> botManagerItem : OriginBotManager.INSTANCE) {
                            if (botManagerItem instanceof MiraiBotManager) {
                                botManage = (MiraiBotManager) botManagerItem;
                            }
                        }
                    }
                }
            }
            return botManage;
        }
    }

    public enum MiraiBot{
        // 可达鸭自己测试用的机器人
        PSYDUCK(1,"3504929659","可达鸭自己测试用的机器人");

        private Integer code;
        private String accountNumber;
        private String description;

        MiraiBot(Integer code, String accountNumber, String description) {
            this.code = code;
            this.accountNumber = accountNumber;
            this.description = description;
        }

        public Integer getCode() {
            return code;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public String getDescription() {
            return description;
        }
    }
}
