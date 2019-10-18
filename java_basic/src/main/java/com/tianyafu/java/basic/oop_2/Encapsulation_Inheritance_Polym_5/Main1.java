package com.tianyafu.java.basic.oop_2.Encapsulation_Inheritance_Polym_5;

/**
 * 这里最主要讲的就是继承
 *
 * 1.这里讲的是 面向对象的三大特性  封装、继承、多态
 * 封装：把对象的属性写在一个类里面，把对象的行为写成一个方法 这样每个对象都可以调用 这就是封装
 *
 * 继承：把公共的属性和方法抽取出来 ，放在父类中，这样每个子类就不需要再重复写一遍公共的东西了 只需要继承父类就行
 *
 * 多态：同一个行为，具有多种不同的表现形式
 *
 * 2.重写
 * 子类继承父类 觉得父类的方法不合适 可以重新定义方法里面的具体实现，这就是重写
 *
 * 3.向上转型和向下造型
 * 父类的引用指向子类的对象 叫做向上转型 ，向上转型是自动转的
 * 父类的引用要转成子类的引用 叫做向下造型 ，向下造型是有风险的，需要经过 instanceof 关键字判断
 *
 * 4.子类继承父类 不能继承父类的构造器
 * 这里需要引出super关键字
 *
 *
 */
public class Main1 {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("zhangsan");
        teacher.setAge("18");
        teacher.setSex("man");
        teacher.color="yello";
        //teacher继承了Person类 所以可以使用Person类中的非private的属性和方法,就像儿子可以使用父亲的钱、衣服这些东西一样
        System.out.println(teacher.getName());

        teacher.eat("apple");

        //非private的属性就可以直接调用, private的属性一般都会提供公有的方法来调用
        System.out.println(teacher.color);

        String teach = teacher.teach(teacher.getName());
        System.out.println(teach);

        //重写
        // 这里new出来的是一个 Man对象 但因为Man 继承了Person类 所以也可以用Person来接收,
        // 这种父类的引用指向子类的对象就是所谓的向上转型，这在后面的面向接口编程中是最常见的
        Person person = new Man();
        //子类重写了父类的方法 所以在调用的时候是调用了子类自身的方法
        String eat = person.eat("肉");
        System.out.println(eat);

        //因为man是父类的引用，Person类没有playBasketBall对象 所以无法调用到playBasketBall方法
//        String basketBall = man.playBasketBall();

        // person这个引用指向的对象是Man 的对象，所以这里用 instanceof 这个关键字来判断是可以进入if语句里面的
        if (person instanceof Man){
            //经过 instanceof 关键字判断后 这里可以放心的把 person 这个引用 强制转为 Man类型的引用，这就是向下造型
            Man man = (Man)person;
            //这样 man 这个引用可以调用到了playBasketBall方法
            String basket = man.playBasketBall();
            System.out.println(basket);
        }
    }
}

/**
 * 老师继承了Person类
 * 子类只能直接继承一个父类，就是所谓的单继承  就像儿子只能有一个亲生父亲一样
 */
class Teacher extends Person{

    //不是每个person都是老师  所以teach的行为不能定义在父类中（这里假设只有老师才有teach这个行为）
    public String teach(String name){
        return name + " teach ......";
    }

}

class Man extends Person{

    public Man() {
        super();
    }

    /**
     * 子类觉得父类的方法不合适 可以对父类的方法进行重写
     * @param something
     * @return
     */
    @Override
    public String eat(String something){
        return "大口大口得吃："+something;
    }

    public String playBasketBall(){
        return "男人打篮球";
    }
}


class Person{

    private String name;

    private String age;

    private String sex;

    String color;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String eat(String something){
        return "eat "+something;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}