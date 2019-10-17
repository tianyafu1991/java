package com.tianyafu.java.basic.syntax_1.数组_7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // 在创建数组的时候就需要指定数组的长度 如下是创建了一个长度为5的数组  数组中每个元素都是int类型的  默认值为 0
        int[] array = new int[5];
        //创建时也可以直接指定数组中的元素 表示数组中共有3个元素  分别为  1 2 3
        int[] array2 = new int[]{1,2,3};
        //这里能输出的是array2 这个数组的句柄  可以理解为在内存中的地址 如果要知道数组中的每个元素  需要进行遍历
        System.out.println(array2);
        //数组的长度
        System.out.println(array.length);

        //数组的索引(下标)  索引从 0 开始
        System.out.println(array[0]);
        System.out.println(array[array.length-1]);

        //数组的遍历
        //根据索引来遍历
       /* for (int i = 0;i <array.length;i++){
            System.out.println(array[i]);
        }
        //增强for循环来遍历
        for (int i : array) {
            System.out.println(i);
        }*/

        //while 遍历  do while 遍历 都是可以的

        //数组的排序
        int[] newArray = new int[]{1,4,7,2,0,8,3};
        Arrays.sort(newArray);
        for (int i : newArray) {
            System.out.println(i);
        }


    }
}
