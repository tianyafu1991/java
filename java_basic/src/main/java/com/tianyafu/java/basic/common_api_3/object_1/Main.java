package com.tianyafu.java.basic.common_api_3.object_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 如果一个类没有特别指定父类，	那么默认则继承自Object类
 *
 * 最常接触到Object的方法有3个
 * toString()
 * equals()
 * hashcode()
 */
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("tianyafu");

        /**
         * 这里的 list.contains()  看一个元素是否在list中 就是equals方法来比较的
         * 如果找到equals比较为true的 就说明包含  如果equals为false的表示不包含
         * 所以我们自己写的java对象一般都要重写equals和hashcode方法
         */
        System.out.println(list.contains("tianyafu"));

    }
}
