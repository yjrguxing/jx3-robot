package com.jx3robot.robot.util;

import net.mamoe.mirai.message.data.*;
import net.mamoe.mirai.utils.ExternalResource;

import java.io.IOException;
import java.io.InputStream;

/***
 * 机器人信息工具类
 * @author psyduck
 * @Date 2023/2/13 16:27
 * @see
 * @version 1.0
 */
public class MiraiMessageUtil {

    /**
     * 获取资源
     * @param filePath 文件路径
     * @return net.mamoe.mirai.utils.ExternalResource
     * @throws IOException
     */
    public ExternalResource getResource(String filePath) throws IOException {
        return ExternalResource.create(FileUtil.getFileInputStream(filePath));
    }

    /**
     * 获取资源
     * @param inputStream 输入流
     * @return net.mamoe.mirai.utils.ExternalResource
     * @throws IOException
     */
    public ExternalResource getResource(InputStream inputStream) throws IOException {
        return ExternalResource.create(inputStream);
    }

    /**
     * 获取At信息
     * @param qq QQ号
     * @return net.mamoe.mirai.message.data.At
     */
    public At getAt(long qq){
        return new At(qq);
    }

    /**
     * 获取AtAll信息
     * @return net.mamoe.mirai.message.data.AtAll
     */
    public AtAll getAtAll(){
        return AtAll.INSTANCE;
    }

    /**
     * 获取表情信息
     * @param id 表情ID
     * @return net.mamoe.mirai.message.data.Face
     */
    public Face getFace(int id){
        return new Face(id);
    }

    /**
     * 获取闪照信息
     * @param image 图片
     * @return
     */
    public FlashImage getFlashImage(Image image){
        return FlashImage.from(image);
    }
}
