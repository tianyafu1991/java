package com.tianyafu.java.basic.common_api_3.Collection_7;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 直接使用Collection比较少 因为Collection是一个接口
 */
public class Main {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("hello ");
        collection.add("chunyu");

        System.out.println(collection.isEmpty());

        System.out.println(collection.contains("chunyu"));

        //转换为数组
        Object[] objects = collection.toArray();

        //清空
        collection.clear();
    }
}
