package com.tianyafu.java.basic.oop_2.oop_basic_1;

/**
 * 1.什么是对象?
 *对象是属性和行为的封装
 * 属性就是一些数据：比如 人的数据可以有姓名  年龄等
 * 行为就是一些动作：比如 人的行为可以是 吃东西  说话  打电话等
 *
 * 2.什么是面向对象?
 * 心里想着对象写类 就是面向对象
 *
 * 3.面向对象的三大特性
 * 封装、继承、多态
 *
 * 4.成员变量和局部变量
 * 定义在方法中的变量或者方法的参数都属于局部变量
 * 在类中的变量为成员变量（当然不是在方法内定义的变量）
 *
 * 成员变量的作用域为整个类
 * 局部变量的作用域为方法中
 *
 * 成员变量有默认值
 * 局部变量没有默认值
 *
 * 5.this关键字
 * this指代的是当前对象  即 哪个对象调用了 this就指代了这个对象
 */
public class Main {

    public static void main(String[] args) {

        Student zhangsan = new Student("zhangsan", "18");
        //调用对象的行为
        zhangsan.eat("egg");
        //因为age属性私有化，所以需要通过 获取年龄这个行为来 获取相应的属性
        //一般的原则就是方法公有化，属性私有化
        String age = zhangsan.getAge();
        System.out.println(age);

    }
}

class Student{

    //属性，也是成员变量
    private String name;
    //属性，也是成员变量
    private String age;

    //无参构造
    public Student() {
    }

    //有参构造
    public Student(String name) {
        this.name = name;
    }

    //有参构造
    public Student(String name, String age) {
        //this指的是当前对象
        this.name = name;
        this.age = age;
    }
    //行为
    public String eat(String something){
        //定义在方法中的变量或者方法的参数都属于局部变量 如：studentName  something 都是局部变量
        String studentName = "tianyafu";
        return studentName+" eat "+something;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
