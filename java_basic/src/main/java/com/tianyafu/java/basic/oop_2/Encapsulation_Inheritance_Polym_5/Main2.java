package com.tianyafu.java.basic.oop_2.Encapsulation_Inheritance_Polym_5;

/**
 * 抽象类在工作中用的比较少 这里简单介绍一下
 *
 *1.抽象类
 * 用 abstract关键字修饰的类就是抽象类，抽象类可以有自己的构造方法 ，但不能通过new 对象的形式来 实例化对象
 * 抽象列中可以没有抽象方法
 *
 * 2.抽象方法
 * 用abstract关键字修饰且没有具体方法实现的方法叫做抽象方法
 *
 */
public class Main2 {

    public static void main(String[] args) {

        Pets pets = new Dog();
        String str = pets.shout();
        System.out.println(str);

    }
}

/**
 * 子类继承抽象类 需要实现父类中没有实现的方法  否则子类也需要用abstract关键字修饰
 */
class Dog extends Pets{

    @Override
    public String shout() {
        return "狗叫";
    }
}

/**
 * 宠物类
 */
abstract class Pets{

    private String name;

    private String sex;

    public Pets() {
    }

    public Pets(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    /**
     * 抽象方法，不同的宠物 叫声是不一样的 ，在这个类中定义方法的具体实现是没有意义的
     * 所以定义一个抽象方法 具体的子类在继承父类的时候需要实现该方法
     * @return
     */
    public abstract String shout();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
