package com.ruoyi.robot.util;

import love.forte.simbot.BotManager;
import love.forte.simbot.OriginBotManager;
import love.forte.simbot.component.mirai.MiraiBotManager;

/**
 * 常量类
 * @author psyduck
 * @Date 2022/4/23 21:19
 * @see
 * @version 1.0
 **/
public class Const {
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
