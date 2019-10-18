package com.tianyafu.java.basic.oop_2.list_3;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.为什么会有List？
 * 前面讲的Array在new的时候需要指定数组的长度 一旦new出来之后 长度是不可变的
 * 如果想要存放未知长度的对象  需要使用List
 *
 */
public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        //添加元素
        list.add("zhangsan");
        list.add("lisi");
        list.add("tianyafu");
        list.add("wangchunyu");

        System.out.println(list);

        //根据下标获取元素
        String name = list.get(3);
        System.out.println(name);

        //获取list的大小
        System.out.println(list.size());

        //根据下标删除元素
        list.remove(0);
        System.out.println(list);

        //查看一个list是否存在某个对象
        if(list.contains("lisi")){
            System.out.println("yes it is contains");
        }

        //判断是否为空的list
        System.out.println(list.isEmpty());
        //更加常用的是用工具类来判断，这个工具类需要导入maven依赖
        if(CollectionUtils.isEmpty(list)){
            System.out.println("is empty");
        }

        if(CollectionUtils.isNotEmpty(list)){
            System.out.println(list);
        }

        //遍历list
        //增强for循环遍历(最常用的)
        for (String str : list) {
            System.out.println(str);
        }

        //普通for循环遍历,一般都是用增强for循环来遍历的，当需要倒序来遍历时，才使用这种普通for循环  list极少使用while  do while来遍历
        //正序遍历
        for (int i = 0; i <list.size();i++){
            System.out.println(list.get(i));
        }

        //倒序遍历
        for (int i = list.size(); i >=0; i--){
            System.out.println(list.get(i));
        }


        //清空list
        list.clear();
        System.out.println(list);



    }
}
