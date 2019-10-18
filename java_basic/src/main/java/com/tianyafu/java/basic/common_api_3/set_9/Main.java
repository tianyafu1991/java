package com.tianyafu.java.basic.common_api_3.set_9;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("hello ");
        set.add("chunyu");

        set.contains("chunyu");

        System.out.println(set.isEmpty());

        set.remove("hello");

        Object[] objects = set.toArray();
    }
}
