package com.tianyafu.java.basic.common_api_3.map_10;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap查询第一快的数据结构
 * 这是最常用的数据结构之一
 */
public class Main {

    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>();
        //存
        map.put("1","hello");
        map.put("2","chunyu");
        //取
        String value = map.get("1");
        //是否包含某个key
        map.containsKey("1");
        //获取大小
        int size = map.size();

        //遍历
        for (Map.Entry<String,String> entry :map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        //清空
        map.clear();

    }
}
