package com.tianyafu.java.basic.oop_2.interface_6;

/**
 * 接口是最常见的，也是多态的体现
 * 在编程中  经常见到的是 接口的引用指向具体实现类的对象
 *
 */
public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        System.out.println(cat.shout());
        System.out.println(cat.MAX_AGE);

    }
}

/**
 * 一个类要实现一个接口 可以用implements关键字，必须重写接口中所有的抽象方法 否则该类也需要是abstract修饰的抽象类
 * 一个类可以实现多个接口，这就是java中常说的 单继承 多实现
 *
 */
class Cat implements Animal{

    @Override
    public String shout() {
        return "猫叫";
    }
}


