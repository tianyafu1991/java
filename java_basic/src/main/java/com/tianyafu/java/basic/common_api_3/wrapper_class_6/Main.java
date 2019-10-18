package com.tianyafu.java.basic.common_api_3.wrapper_class_6;

/**
 * java中有8中基本类型  不是对象 所以java中对这8中基本类型提供了相应的包装类
 */
public class Main {

    public static void main(String[] args) {
        //装箱 把基本类型变成一个包装对象称为 装箱
        int a = 4;
        Integer integer = new Integer(a);
        System.out.println(integer);

        //拆箱  把一个包装对象转化为基本类型称为 拆箱
        int b = integer.intValue();
        System.out.println(b);
        //自动装箱
        Integer integer1 = 4;

        //自动拆箱, 在运算的时候，integer1转换为 基本类型后再与 a进行相加
        int c = integer1+a;

    }
}
