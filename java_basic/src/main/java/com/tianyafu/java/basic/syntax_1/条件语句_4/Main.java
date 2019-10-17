package com.tianyafu.java.basic.syntax_1.条件语句_4;

public class Main {
    public static void main(String[] args) {

        /**
         * 条件语句有两类
         *
         * 一、 if else           if  else if   else
         * 二、 switch case
         */

        int a ,b , c ,d , e, f;
        a = b = c = d = 1;
        e = f = 2;

        if (a ==b){
            System.out.println("a==b");
        }else if (a>b){
            System.out.println("a>b");
        }else {
            System.out.println("a<b");
        }

        switch (a + e){
            case 1:
                System.out.println(11);
                break;
            case 2:
                System.out.println(22);
            case 3:
                System.out.println(33);
                break;
            default:
                    System.out.println(444);
        }

    }
}
