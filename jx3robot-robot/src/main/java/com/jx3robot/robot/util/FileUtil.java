package com.jx3robot.robot.util;

import java.io.InputStream;

/**
 * 文件工具类
 * @author psyduck
 * @Date 2022/6/18 1:46
 * @see
 * @version 1.0
 **/
public class FileUtil {
    public static InputStream getClassLoaderFileInputStream(String fileName){
        return FileUtil.class.getClassLoader().getResourceAsStream(fileName);
    }
}
