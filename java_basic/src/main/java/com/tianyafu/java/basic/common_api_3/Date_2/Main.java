package com.tianyafu.java.basic.common_api_3.Date_2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date 类很多方法已经过时了 所以一般现在用的也少
 */
public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        //格式化date的
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //把一个Date类型的对象按照格式转换为字符串
        String dateStr = dateFormat.format(date);
        System.out.println(dateStr);

        try {
            //把一个时间格式的字符串转换为Date类型
            Date parse = dateFormat.parse(dateStr);
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
