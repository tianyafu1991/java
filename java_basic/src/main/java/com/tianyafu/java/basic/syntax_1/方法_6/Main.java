package com.tianyafu.java.basic.syntax_1.方法_6;

public class Main {

    /**
     * 普通方法 不能再静态方法中直接调用
     * 因为普通方法是属于对象的方法  需要由对象来调用
     * @return
     */
    public String getName(){
        return "tianyafu";
    }


    /**
     * 静态方法 可以在静态方法中直接调用
     * @return
     */
    public static int getAge(){
        return 1;
    }

    public static void main(String[] args) {
        //静态方法直接调用
        int age = getAge();
        System.out.println(age);

        //非静态方法需要由对象来调用
        Main main = new Main();
        String name = main.getName();
        System.out.println(name);

        //new 对象时 调用了有参构造
        Student zhangsan = new Student("zhangsan", "18");
        zhangsan.eat("fish");

        //new 对象时 调用了无参构造
        Student lisi = new Student();
        lisi.eat("egg");

    }

}


class Student{
    private String name;

    private String age;

    /**
     * 构造方法
     *
     * 1. 构造方法没有返回值
     * 2. 构造方法的方法名就是类名
     * 3. 构造方法不能是静态的 即 不能用static来修饰
     * 4. 一个类默认是提供了一个无参构造器的（可以不显式的写在代码中），
     * 但如果已经提供了一个有参构造器 则此时无参构造不是默认提供的，如果需要用到无参构造器 ，需要显式的写在代码中
     * 5. Student student = new Student(); 这种 new对象的操作是调用了构造器来生成对象的 ，具体调用了哪个构造器要看方法签名
     */
    public Student(){}

    public Student(String name,String age){
        this.name = name;
        this.age = age;
    }

    /**
     * 方法签名：
     * 方法名和参数列表共同组成了方法签名
     * @param something
     */
    public void eat(String something){
        if(null ==this.name){
            this.name = "tianyafu";
        }
        System.out.println(this.name+" eat "+something);
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
