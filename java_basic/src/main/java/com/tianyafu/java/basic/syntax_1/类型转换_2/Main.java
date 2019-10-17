package com.tianyafu.java.basic.syntax_1.类型转换_2;

public class Main {

    public static void main(String[] args) {
        /**
         * 类型转换：
         * 小转大 自动转
         * 大转小 强制转
         *
         */

        //小转大
        byte a = 1;
        short b  = a;
        int c = a;
        double d = a;
        float e = a;

        // 大转小 强制转
        int f = 10;
        byte g = (byte)f;

        /**
         * 做运算时  小类型自动向大类型做转换
         *
         * byte、short、char‐‐>int‐‐>long‐‐>float‐‐>double
         */
        //a 为byte   f为int  结果为 int   用二进制来理解就是 一个8位 的二进制与32位的二进制数做运算  8位的需要补成32位的
        int h = a + f;

        /**
         * 强制转可能造成精度的丢失
         */
        int i = 5;
        double j = 5.12;
        // i 为32位的二进制数 j为64位的二进制数  运算时 i 需要补位成64位的 运算结果也为64位的 如果用int类型的变量来接收需要强制转
        int k = (int)(i+j);
        //输出结果为 10  说明强制转成int造成了精度的丢失
        System.out.println(k);

        /**
         * 强制转造成了范围的溢出
         */
        // short的范围为 -32768——32767
        short l = 32767;

        short m = (short)(l + 10);
        // 结果为 -32759 造成了范围的溢出
        System.out.println(m);

        /**
         * ASCII编码表
         * 所有的英文字母，数字，符号都和十进制进行了对应
         * 字母 A 在 ASCII编码表中对应 65
         * 字母 a 在 ASCII编码表中对应 97
         */
        char n = 'a';
        int o = 1;

        int p = n + o;
        //输出结果为 98
        System.out.println(p);






    }
}
