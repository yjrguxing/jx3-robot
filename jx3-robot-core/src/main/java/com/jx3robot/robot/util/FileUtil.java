package com.jx3robot.robot.util;

import java.io.File;
import java.io.InputStream;

/**
 * 文件工具类
 * @author psyduck
 * @Date 2022/6/18 1:46
 * @see
 * @version 1.0
 **/
public class FileUtil {
    /**
     * 获取文件输入流<br/>
     * 对打包后环境和运行环境做了自动适应
     * @param fileName 文件路径 从Resource或根路径开始写
     * @author psyduck
     * @date 2022/6/18 19:43
     * @return java.io.InputStream
     */
    public static InputStream getFileInputStream(String fileName){
        return FileUtil.class.getClassLoader().getResourceAsStream(fileName) == null ?
                FileUtil.class.getResourceAsStream(fileName) : FileUtil.class.getClassLoader().getResourceAsStream(fileName);
    }

    /**
     * 创建文件夹
     * @param path 文件夹路径
     * @author psyduck
     * @date 2023/2/15 10:05
     * @return java.io.File
     */
    public static File createDirectoryIfNotExists(String path){
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
        }
        return file;
    }

}
