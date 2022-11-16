package com.jx3robot.robot.util;

import love.forte.simbot.bot.BotManager;
import love.forte.simbot.bot.OriginBotManager;
import love.forte.simbot.component.mirai.bot.MiraiBotManager;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

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
        public static final HashMap<String,String> bpsHashMap = new HashMap<>(
                Map.ofEntries(
                        // 冰心
                        new AbstractMap.SimpleEntry<>("冰心", "10081"),
                        // 奶秀
                        // 花间
                        new AbstractMap.SimpleEntry<>("花间", "10021"),
                        new AbstractMap.SimpleEntry<>("花间游", "10021"),
                        // 奶花
                        // 毒经
                        new AbstractMap.SimpleEntry<>("毒经", "10175"),
                        new AbstractMap.SimpleEntry<>("五毒", "10175"),
                        // 奶毒
                        // 莫问
                        new AbstractMap.SimpleEntry<>("莫问", "10447"),
                        new AbstractMap.SimpleEntry<>("长歌","10447"),
                        // 相知
                        // 无方
                        new AbstractMap.SimpleEntry<>("无方","10627"),
                        new AbstractMap.SimpleEntry<>("药宗","10627"),
                        // 灵素
                        // 傲血战意
                        new AbstractMap.SimpleEntry<>("傲血","10026"),
                        new AbstractMap.SimpleEntry<>("傲血战意","10026"),
                        new AbstractMap.SimpleEntry<>("天策","10026"),
                        // 铁牢律
                        new AbstractMap.SimpleEntry<>("策T","10062"),
                        new AbstractMap.SimpleEntry<>("铁牢","10062"),
                        new AbstractMap.SimpleEntry<>("铁牢律","10062"),
                        // 易筋经
                        new AbstractMap.SimpleEntry<>("易筋经","10003"),
                        new AbstractMap.SimpleEntry<>("易筋","10003"),
                        new AbstractMap.SimpleEntry<>("大师","10003"),
                        new AbstractMap.SimpleEntry<>("和尚","10003"),
                        new AbstractMap.SimpleEntry<>("少林","10003"),
                        new AbstractMap.SimpleEntry<>("秃驴","10003"),
                        // 洗髓经
                        new AbstractMap.SimpleEntry<>("洗髓经","10002"),
                        // 焚影圣诀
                        new AbstractMap.SimpleEntry<>("焚影","10242"),
                        new AbstractMap.SimpleEntry<>("焚影圣诀","10242"),
                        // 明尊琉璃体
                        new AbstractMap.SimpleEntry<>("明尊","10243"),
                        new AbstractMap.SimpleEntry<>("喵T","10243"),
                        // 分山劲
                        new AbstractMap.SimpleEntry<>("苍云","10390"),
                        new AbstractMap.SimpleEntry<>("分山","10390"),
                        new AbstractMap.SimpleEntry<>("分山劲","10390"),
                        // 铁骨衣
                        new AbstractMap.SimpleEntry<>("铁骨","10389"),
                        new AbstractMap.SimpleEntry<>("苍云T","10389"),
                        // 紫霞功
                        new AbstractMap.SimpleEntry<>("紫霞功","10014"),
                        new AbstractMap.SimpleEntry<>("气纯","10014"),
                        // 太虚剑意
                        new AbstractMap.SimpleEntry<>("太虚剑意","10015"),
                        new AbstractMap.SimpleEntry<>("剑纯","10015"),
                        // 惊羽诀
                        new AbstractMap.SimpleEntry<>("鲸鱼","10224"),
                        new AbstractMap.SimpleEntry<>("惊羽","10224"),
                        new AbstractMap.SimpleEntry<>("惊羽诀","10224"),
                        // 天罗诡道
                        new AbstractMap.SimpleEntry<>("田螺","10225"),
                        new AbstractMap.SimpleEntry<>("天罗诡道","10225"),
                        // 藏剑
                        new AbstractMap.SimpleEntry<>("藏剑","10144"),
                        // 丐帮
                        new AbstractMap.SimpleEntry<>("丐帮","10268"),
                        // 霸刀
                        new AbstractMap.SimpleEntry<>("霸刀","10464"),
                        // 蓬莱
                        new AbstractMap.SimpleEntry<>("蓬莱","10533"),
                        // 凌雪阁
                        new AbstractMap.SimpleEntry<>("凌雪阁","10585"),
                        // 演员
                        new AbstractMap.SimpleEntry<>("衍天宗","10615"),
                        new AbstractMap.SimpleEntry<>("演员","10615")
                )
        );

        public static final HashMap<String,String> qxJsonMap = new HashMap<>(
                Map.ofEntries(
                        new AbstractMap.SimpleEntry<>("v20190926",""),
                        new AbstractMap.SimpleEntry<>("v20191016",""),
                        new AbstractMap.SimpleEntry<>("v20191026",""),
                        new AbstractMap.SimpleEntry<>("v20191027",""),
                        new AbstractMap.SimpleEntry<>("v20191120",""),
                        new AbstractMap.SimpleEntry<>("v20191124",""),
                        new AbstractMap.SimpleEntry<>("v20191128",""),
                        new AbstractMap.SimpleEntry<>("v20200113",""),
                        new AbstractMap.SimpleEntry<>("v20200217",""),
                        new AbstractMap.SimpleEntry<>("v20200309",""),
                        new AbstractMap.SimpleEntry<>("v20200521",""),
                        new AbstractMap.SimpleEntry<>("v20200522",""),
                        new AbstractMap.SimpleEntry<>("v20200602",""),
                        new AbstractMap.SimpleEntry<>("v20200805",""),
                        new AbstractMap.SimpleEntry<>("v20200915",""),
                        new AbstractMap.SimpleEntry<>("v20200923",""),
                        new AbstractMap.SimpleEntry<>("v20200925",""),
                        new AbstractMap.SimpleEntry<>("v20201020",""),
                        new AbstractMap.SimpleEntry<>("v20201030",""),
                        new AbstractMap.SimpleEntry<>("v20201130",""),
                        new AbstractMap.SimpleEntry<>("v20210413",""),
                        new AbstractMap.SimpleEntry<>("v20210422",""),
                        new AbstractMap.SimpleEntry<>("v20210513",""),
                        new AbstractMap.SimpleEntry<>("v20210621",""),
                        new AbstractMap.SimpleEntry<>("v20210730",""),
                        new AbstractMap.SimpleEntry<>("v20210830",""),
                        new AbstractMap.SimpleEntry<>("v20211014",""),
                        new AbstractMap.SimpleEntry<>("v20211027",""),
                        new AbstractMap.SimpleEntry<>("v20211028",""),
                        new AbstractMap.SimpleEntry<>("v20211201",""),
                        new AbstractMap.SimpleEntry<>("v20211214",""),
                        new AbstractMap.SimpleEntry<>("v20211217",""),
                        new AbstractMap.SimpleEntry<>("v20220118",""),
                        new AbstractMap.SimpleEntry<>("v20220402",""),
                        new AbstractMap.SimpleEntry<>("v20220428","")
                )
        );
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
