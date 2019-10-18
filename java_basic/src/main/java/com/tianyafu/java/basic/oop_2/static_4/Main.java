package com.tianyafu.java.basic.oop_2.static_4;

/**
 * 1.可以用static来修饰成员变量和方法，被修饰的成员变量和方法都是属于类的，不是属于对象的
 * 在调用的时候  ，可以不用new 对象 无需通过对象来点 ，可以直接用类名来 点
 *
 *2.静态方法中不能直接引用非静态的成员变量,如需访问 需要通过new 对象 ，然后通过对象来访问
 *
 */
public class Main {
    public static String name = "tianyafu";

    public  String age ="18";

    public static String sayHello(String name){
        return "hello "+name;
    }


    public static void main(String[] args) {

        String hello = Main.sayHello(Main.name);
        System.out.println(hello);
        //静态方法中不能直接引用非静态的成员变量，只能访问静态成员变量
//        System.out.println(age);
        System.out.println(name);

        //静态方法中访问非静态的成员变量 需要通过对象来点
        Main main = new Main();
        System.out.println(main.age);
    }
}
