package com.jx3robot.robot.util;

import net.mamoe.mirai.Bot;
import net.mamoe.mirai.contact.ContactList;
import net.mamoe.mirai.contact.Friend;
import net.mamoe.mirai.contact.Group;

/**
 * 联系人工具类
 * @author psyduck
 * @Date 2023/2/9 10:16
 * @see
 * @version 1.0
 */
public class MiraiContactUtil {

    /**
     * 获取机器人的好友列表
     * @param bot 机器人
     * @return net.mamoe.mirai.contact.ContactList<net.mamoe.mirai.contact.Friend>
     */
    public static ContactList<Friend> getFriends(Bot bot){
        return bot.getFriends();
    }

    /**
     * 获取机器人的群列表
     * @param bot 机器人
     * @return net.mamoe.mirai.contact.ContactList<net.mamoe.mirai.contact.Group>
     */
    public static ContactList<Group> getGroups(Bot bot){
        return bot.getGroups();
    }

    /**
     * 向机器人的所有群发送消息
     * @param bot 机器人
     * @param message 消息
     */
    public static void announcement(Bot bot, String message){
        bot.getGroups().forEach(group -> group.sendMessage(message));
    }

    /**
     * 向指定群发消息
     * @param bot 机器人
     * @param groupId 群号
     * @param message 消息
     */
    public static void sendGroupMessage(Bot bot, Long groupId, String message){
        bot.getGroup(groupId).sendMessage(message);
    }

    /**
     * 向指定好友发消息
     * @param bot 机器人
     * @param friendId 好友QQ号
     * @param message 消息
     */
    public static void sendFriendMessage(Bot bot, Long friendId, String message) {
        bot.getFriend(friendId).sendMessage(message);
    }

    /**
     * 向指定群的指定成员发消息
     * @param bot 机器人
     * @param groupId 群号
     * @param memberId 成员QQ号
     * @param message 消息
     */
    public static void sendGroupMemberMessage(Bot bot, Long groupId, Long memberId, String message){
        bot.getGroup(groupId).get(memberId).sendMessage(message);
    }

    /**
     * 向机器人的所有其他客户端发送消息
     * @param bot 机器人
     * @param message 消息
     */
    public static void sendMessageToOtherClient(Bot bot, String message){
        bot.getOtherClients().forEach(client -> client.sendMessage(message));
    }

    /**
     * 戳一戳指定群的指定成员
     * @param bot 机器人
     * @param groupId 群号
     * @param memberId 成员QQ号
     */
    public static void nudgeGroupMember(Bot bot, Long groupId, Long memberId){
        bot.getGroup(groupId).get(memberId).nudge();
    }

    /**
     * 戳一戳指定好友
     * @param bot 机器人
     * @param friendId 好友QQ号
     */
    public static void nudgeFriend(Bot bot, Long friendId){
        bot.getFriend(friendId).nudge();
    }

    /**
     *
     * @param bot 机器人
     * @param groupId 群号
     * @param memberId 成员QQ号
     * @param time 禁言时间，单位秒
     */
    public static void muteGroupMember(Bot bot, Long groupId, Long memberId, int time){
        bot.getGroup(groupId).get(memberId).mute(time);
    }

    /**
     * 取消禁言
     * @param bot 机器人
     * @param groupId 群号
     * @param memberId 成员QQ号
     */
    public static void unmuteGroupMember(Bot bot, Long groupId, Long memberId) {
        bot.getGroup(groupId).get(memberId).unmute();
    }

    /**
     * 踢出群成员
     * @param bot 机器人
     * @param groupId 群号
     * @param memberId 成员QQ号
     * @param message 踢出原因
     */
    public static void kickGroupMember(Bot bot, Long groupId, Long memberId, String message){
        bot.getGroup(groupId).get(memberId).kick(message);
    }

    /**
     * 退出群
     * @param bot 机器人
     * @param groupId 群号
     */
    public static void quitGroup(Bot bot, Long groupId) {
        bot.getGroup(groupId).quit();
    }

}
