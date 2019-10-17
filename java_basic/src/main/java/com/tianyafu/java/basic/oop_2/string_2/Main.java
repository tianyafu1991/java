package com.tianyafu.java.basic.oop_2.string_2;

import java.io.UnsupportedEncodingException;

/**
 * String类是非常重要的一个java 提供的类
 * 这里只讲一些常用的方法调用
 *
 * 1. 字符串在创建之后就不可变了
 *
 *
 */
public class Main {

    public static void main(String[] args) {

        String str = "hello world hello tianyafu hello wangchunyu";
        //调用length()方法获取字符串长度
        System.out.println(str.length());

        //分割字符串
        String[] splits = str.split(" ");
        for (String split : splits) {
//            System.out.println(split);
        }

        //截取字符串
        String substring1 = str.substring(6); //从下标为6的地方开始截取
        System.out.println(substring1);

        String substring2 = str.substring(0, 5);//从下标为0的地方开始截取 一直截取到下标为4的位置  这里的5是不包含的 即含头不含尾
        System.out.println(substring2);

        //拼接字符串
        String str2 = " hello hangzhou";
        String newStr = str + str2;
        System.out.println(newStr);

        //返回指定索引处的char值
        char c = str.charAt(4);
        System.out.println(c);

        //返回指定子字符串第一次出现在该字符串内的索引
        int helloIndex = str.indexOf("hello");
        System.out.println(helloIndex);

        //转成byte数组，还可以指定字符集
        byte[] bytes = str.getBytes(); //不指定字符集

        try {
            //指定字符集
            byte[] bytes1 = str.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //替换
        String replaceStr = str.replace("hello", "hi");
        System.out.println(replaceStr);
    }
}
