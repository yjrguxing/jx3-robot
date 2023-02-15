package com.jx3robot.robot.listener;

import com.jx3robot.common.core.redis.RedisCache;
import com.jx3robot.common.utils.spring.SpringUtils;
import kotlin.coroutines.CoroutineContext;
import net.mamoe.mirai.event.EventHandler;
import net.mamoe.mirai.event.ListeningStatus;
import net.mamoe.mirai.event.SimpleListenerHost;
import net.mamoe.mirai.event.events.GroupMessageEvent;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class GroupMessageEventListener extends SimpleListenerHost {

    public static final String TAG = "核心功能--群信息监听/核心功能--群信息缓存";

    private static RedisCache redisCache = SpringUtils.getBean(RedisCache.class);

    @Override
    public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
        super.handleException(context, exception);
        System.out.println("GroupMessageEventListener.handleException");
        System.out.println(exception.getMessage());
        System.out.println(context);
    }

    /**
     * 监听并缓存群消息
     * 缓存时间5分钟
     * @param event 群消息事件
     * @return
     */
    @EventHandler
    public ListeningStatus GroupMessageListener(@NotNull GroupMessageEvent event){
        redisCache.setCacheObject(String.valueOf(event.getSource().getIds()[0]),event.getMessage().contentToString(),60*5, TimeUnit.SECONDS);
        return ListeningStatus.LISTENING;
    }
}
