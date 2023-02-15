package com.jx3robot.robot.listener;

import com.jx3robot.common.core.redis.RedisCache;
import com.jx3robot.common.utils.spring.SpringUtils;
import kotlin.coroutines.CoroutineContext;
import net.mamoe.mirai.event.EventHandler;
import net.mamoe.mirai.event.ListeningStatus;
import net.mamoe.mirai.event.SimpleListenerHost;
import net.mamoe.mirai.event.events.MessageRecallEvent;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

@Component
public class MessageRecallEventListener extends SimpleListenerHost {

    public static final String TAG = "通用功能--防撤回";

    private static RedisCache redisCache = SpringUtils.getBean(RedisCache.class);


    @Override
    public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
        super.handleException(context, exception);
        System.out.println("MessageRecallEventListener.handleException");
        System.out.println(exception.getMessage());
        System.out.println(context);
    }

    @EventHandler
    public ListeningStatus MessageRecallListener(@NotNull MessageRecallEvent.GroupRecall event){
        String message = redisCache.getCacheObject(String.valueOf(event.getMessageIds()[0]));
        if (message != null){
            if (event.getOperator().getId() != event.getAuthorId()){
                event.getGroup().sendMessage(event.getAuthorId() + "被" + event.getOperator().getId() + "撤回了一条消息,信息如下:\n" + message);
            }else{
                event.getGroup().sendMessage(event.getAuthorId() + "撤回了一条消息,信息如下:\n" + message);
            }
        }
        return ListeningStatus.LISTENING;
    }
}
