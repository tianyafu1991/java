package com.tianyafu.java.basic.syntax_1.循环语句_5;

public class Main {

    public static void main(String[] args) {
        /**
         * 循环语句有3种
         *
         * 一、while(){
         *
         * }
         *
         * 二、
         * do{
         *
         * }while()
         *
         * 三、
         * for(){
         *
         * }
         */

        // while循环
        int a = 5;

        while (a-- >=1){
            System.out.println(a);
        }



        // do{}while()循环
        int b = 5;
        do {
            System.out.println(b);
        }while (b-->=1);

        // for循环
        int c = 0;
        for(;c<10;c++ ){
            System.out.println(c);
        }

        for(int i = 10; i<0; i--){
            System.out.println(i);
        }

        //死循环
        /*while (a--<10){
            System.out.println(111);
        }*/

        /*do{
            System.out.println(222);
        }while (true);*/

        for(int f=0; f >=0; f++){
            System.out.println(333);
        }
    }
}
