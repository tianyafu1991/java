package com.tianyafu.java.basic.common_api_3.Calendar_3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 自从java8推出 新的时间API之后 这个类现在用的也越来越少了
 *
 */
public class Main {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        /**
         * 根据get方法可以获取很多常用的时间上的值 比如：年月日 时分秒 一周的第几天  当前是一年中的第几周等
         */
        int i = calendar.get(Calendar.YEAR);
        /**
         * 在Calendar类中，以0-11来代表1-12月份，所以这里的月份是差一个月的 所以要获取当前正确的月份 需要+1
         * 在Calendar类中，一周的第一天为周日
         */
        int j = calendar.get(Calendar.MONTH)+1;
        int k = calendar.get(Calendar.DATE);

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        //获取一个代表当前时间的Date类型的对象
        Date time = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStr = dateFormat.format(time);
        System.out.println(timeStr);
    }
}
