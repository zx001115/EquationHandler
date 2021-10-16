package com.czh.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * 文件读写工具类
 * @author chenzhuohong
 */
public class AccessUtils {

    /**
     * 从绝对路径中读入算式
     * @param readPath 文本路径
     * @return 算式list
     */
    public static ArrayList<String> readEquation(String readPath){
        if(readPath == null){
            throw new NullPointerException("文本路径为空");
        }
        ArrayList<String> equationList = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(readPath), StandardCharsets.UTF_8));
            String strBuffer;
            while((strBuffer = reader.readLine())!=null){
                int index = strBuffer.lastIndexOf(".");
                equationList.add(strBuffer.substring(index+2));
            }
            reader.close();
            return equationList;
        }catch (Exception e){
            throw new NullPointerException("文本路径错误");
        }
    }

    /**
     * 将String写入路径文件
     * @param text String
     * @param writePath 写入文件的绝对路径
     */
    public static void write(String text, String writePath){
        try{
            System.out.println("写入:" + text);
            FileWriter writer = new FileWriter(writePath, true);
            writer.write(text+"\n");
            writer.flush();
            System.out.println("已写入文件:" + writePath);
            writer.close();
        }catch (Exception e){
            System.out.println("写入文件失败");
        }
    }
}