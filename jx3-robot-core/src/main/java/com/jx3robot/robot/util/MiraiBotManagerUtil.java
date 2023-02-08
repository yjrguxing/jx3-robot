package com.jx3robot.robot.util;

import net.mamoe.mirai.Bot;
import net.mamoe.mirai.BotFactory;
import net.mamoe.mirai.utils.BotConfiguration;

import java.io.File;

/**
 * 机器人工具类
 * @author psyduck
 * @Date 2023/2/8 16:52
 * @see
 * @version 1.0
 **/
public class MiraiBotManagerUtil {

    /**
     * 机器人登录
     * @param bot 机器人
     * @return
     */
    public static Bot botLogin(Bot bot){
        bot.login();
        return bot;
    }

    /**
     * 创建一个机器人
     * @param qq 机器人QQ号
     * @param password 机器人密码
     * @param filePath 机器人资料存储文件路径
     * @return net.mamoe.mirai.Bot
     */
    public static Bot createMiraiBot(String qq, String password, String filePath){
        return BotFactory.INSTANCE.newBot(Long.parseLong(qq), password,createBotConfiguration(filePath,qq));
    }

    /**
     * 创建一个机器人
     * @param qq 机器人QQ号
     * @param password 机器人密码
     * @param botConfiguration 机器人配置
     * @return net.mamoe.mirai.Bot
     */
    public static Bot createMiraiBot(String qq, String password, BotConfiguration botConfiguration){
        return BotFactory.INSTANCE.newBot(Long.parseLong(qq), password,botConfiguration);
    }


    /**
     * 创建一个机器人
     * @param qq 机器人QQ号
     * @param password 机器人密码
     * @param filePath 机器人资料存储文件路径
     * @param protocol 机器人协议
     * @return net.mamoe.mirai.Bot
     */
    public static Bot createMiraiBot(String qq, String password, String filePath, BotConfiguration.MiraiProtocol protocol) {
        return BotFactory.INSTANCE.newBot(Long.parseLong(qq), password, createBotConfiguration(filePath, qq, protocol));
    }

    /**
     * 创建一个机器人
     * @param qq 机器人QQ号
     * @param password 机器人密码
     * @param filePath 机器人资料存储文件路径
     * @param protocol 机器人协议
     * @param heartbeatStrategy 心跳策略
     * @return net.mamoe.mirai.Bot
     */
    public static Bot createMiraiBot(String qq, String password, String filePath, BotConfiguration.MiraiProtocol protocol, BotConfiguration.HeartbeatStrategy heartbeatStrategy) {
        return BotFactory.INSTANCE.newBot(Long.parseLong(qq), password, createBotConfiguration(filePath, qq, protocol, heartbeatStrategy));
    }

    /**
     * 创建一个机器人
     * @param qq 机器人QQ号
     * @param password 机器人密码
     * @param filePath 机器人资料存储文件路径
     * @param protocol 机器人协议
     * @param heartbeatStrategy 心跳策略
     * @param deviceInfoPath 设备信息文件路径
     * @return net.mamoe.mirai.Bot
     */
    public static Bot createMiraiBot(String qq, String password, String filePath, BotConfiguration.MiraiProtocol protocol, BotConfiguration.HeartbeatStrategy heartbeatStrategy, String deviceInfoPath) {
        return BotFactory.INSTANCE.newBot(Long.parseLong(qq), password, createBotConfiguration(filePath, qq, protocol, heartbeatStrategy, deviceInfoPath));
    }

    /**
     * 创建一个机器人配置
     * @param filePath 机器人配置文件路径
     * @param qq 机器人QQ号
     * @return net.mamoe.mirai.utils.BotConfiguration
     */
    public static BotConfiguration createBotConfiguration(String filePath, String qq){
        BotConfiguration botConfiguration = new BotConfiguration();
        botConfiguration.setHeartbeatStrategy(BotConfiguration.HeartbeatStrategy.STAT_HB);
        botConfiguration.setProtocol(BotConfiguration.MiraiProtocol.ANDROID_PHONE);
        botConfiguration.setWorkingDir(new File(filePath + qq));
        botConfiguration.setCacheDir(new File(filePath + qq + "/Cache"));
        botConfiguration.fileBasedDeviceInfo("device.json");
        return botConfiguration;
    }

    /**
     * 创建一个机器人配置
     * @param filePath 机器人配置文件路径
     * @param qq 机器人QQ号
     * @param protocol 机器人协议
     * @return net.mamoe.mirai.utils.BotConfiguration
     */
    public static BotConfiguration createBotConfiguration(String filePath, String qq, BotConfiguration.MiraiProtocol protocol){
        BotConfiguration botConfiguration = new BotConfiguration();
        botConfiguration.setHeartbeatStrategy(BotConfiguration.HeartbeatStrategy.STAT_HB);
        botConfiguration.setProtocol(protocol);
        botConfiguration.setWorkingDir(new File(filePath + qq));
        botConfiguration.setCacheDir(new File(filePath + qq + "/Cache"));
        botConfiguration.fileBasedDeviceInfo("device.json");
        return botConfiguration;
    }

    /**
     * 创建一个机器人配置
     * @param filePath 机器人配置文件路径
     * @param qq 机器人QQ号
     * @param protocol 机器人协议
     * @param heartbeatStrategy 心跳策略
     * @return net.mamoe.mirai.utils.BotConfiguration
     */
    public static BotConfiguration createBotConfiguration(String filePath, String qq, BotConfiguration.MiraiProtocol protocol, BotConfiguration.HeartbeatStrategy heartbeatStrategy) {
        BotConfiguration botConfiguration = new BotConfiguration();
        botConfiguration.setHeartbeatStrategy(heartbeatStrategy);
        botConfiguration.setProtocol(protocol);
        botConfiguration.setWorkingDir(new File(filePath + qq));
        botConfiguration.setCacheDir(new File(filePath + qq + "/Cache"));
        botConfiguration.fileBasedDeviceInfo("device.json");
        return botConfiguration;
    }

    /**
     * 创建一个机器人配置
     * @param filePath 机器人配置文件路径
     * @param qq 机器人QQ号
     * @param protocol 机器人协议
     * @param heartbeatStrategy 心跳策略
     * @param deviceInfoPath 设备信息文件路径
     * @return net.mamoe.mirai.utils.BotConfiguration
     */
    public static BotConfiguration createBotConfiguration(String filePath, String qq, BotConfiguration.MiraiProtocol protocol, BotConfiguration.HeartbeatStrategy heartbeatStrategy, String deviceInfoPath) {
        BotConfiguration botConfiguration = new BotConfiguration();
        botConfiguration.setHeartbeatStrategy(heartbeatStrategy);
        botConfiguration.setProtocol(protocol);
        botConfiguration.setWorkingDir(new File(filePath + qq));
        botConfiguration.setCacheDir(new File(filePath + qq + "/Cache"));
        botConfiguration.fileBasedDeviceInfo(deviceInfoPath);
        return botConfiguration;
    }
}
