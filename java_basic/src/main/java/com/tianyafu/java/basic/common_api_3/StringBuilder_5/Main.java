package com.tianyafu.java.basic.common_api_3.StringBuilder_5;

/**
 * StringBuilder 用于字符串的拼接
 * 因为String 类型的对象是不可变的 所以使用 + 的形式来做字符串拼接 会产生多个字符串对象
 * 而StringBuilder对象是可变的 所以只会产生一个对象
 */
public class Main {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("hello ");
        builder.append("world");

        builder.append(" hello tianyafu").append(" hello wangchunyu");
        System.out.println(builder);

        String str ="";
        for (int i = 0; i<100; i++){
            //这种通过 + 来做的字符串拼接 每 + 一次就产生一个String对象
            str +="hello ";
        }
        System.out.println(str);

        StringBuilder builder1 = new StringBuilder("");
        for (int i = 0;i <100;i++){
            //这种通过StringBuilder来做的拼接 只会产生的一个对象 这是一种性能优化
            builder1.append("hello ");
        }
        System.out.println(builder1);

    }
}
