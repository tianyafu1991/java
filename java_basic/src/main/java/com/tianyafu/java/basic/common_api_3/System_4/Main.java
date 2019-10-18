package com.tianyafu.java.basic.common_api_3.System_4;

/**
 * 除了常见的System.out.println 这种用法外
 * System最常用的就是 获取当前系统时间与1970年01月01日00:00点之间的毫秒差值,获取到的是一个时间戳
 */
public class Main {
    public static void main(String[] args) {
        //常见的，获取时间戳
        System.out.println(System.currentTimeMillis());

        //这种偶尔也能见到 就是程序终止运行，传一个非0 的参数表示程序异常终止 传一个0 表示程序正常终止
        System.exit(1);
    }
}
