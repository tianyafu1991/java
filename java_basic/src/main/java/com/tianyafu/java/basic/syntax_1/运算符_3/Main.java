package com.tianyafu.java.basic.syntax_1.运算符_3;

public class Main {

    public static void main(String[] args) {
        /**
         * 算数运算符
         *  + - * / % ++ --
         */
        int a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t;
        a = 1;
        b = 2;
        c = a + b;
        d = a - b;
        e = a * b;
        f = a / b;  //f = 0;  1除以2 商为0 余数为1
        g = a % b;   //取余  为1
        h = a++;     // ++在后 是先进行赋值 再进行运算 所以先将 a 赋值给h  然后 a再 +1  此步操作后 a 为2
        i = ++a;     // ++在前 是先进行运算 在进行赋值 所以先将 a +1变为3  再将 3 赋值给 i
        j = a++ + ++a; // 可以看成 j = A + B  A=a++  B=++a  所以A=3  B=5 结果为8
        System.out.println("f = " + f + ", g = " + g + ", h = " + h + ", i = " + i + ", j = " + j);

        /**
         * 赋值运算符
         * +=  -=  *=  /=  %=
         *
         */
        k = l = m = n = o = 1;
        k += 1;
        l -= 1;
        m *= 1;
        n /= 1;
        o %= 2;
        System.out.println(k);

        /**
         * 比较运算符
         *  >  <  == !=  >=  <=
         */
        p = 1;
        q = 2;
        System.out.println(p > 1);
        System.out.println(p < 1);
        System.out.println(p == 1);
        System.out.println(p >= 1);
        System.out.println(p <= 1);
        System.out.println(p != 1);

        /**
         * 逻辑运算符
         *  &&  ||  !
         *  &  |
         */
        // &&是短路与 两true 才为true  前面一个为false 则后一个不在进行计算
        r = 1;
        boolean bool = r == 1 && --r == 0;
        System.out.println(bool + "," + r);

        s = 1;
        boolean bool2 = s != 1 && --s == 0;
        System.out.println(bool2 + "," + s);

        // ||为短路或  有true就为 true


        // ! 为逻辑非  取反  !true 为false  !false为true


        /**
         * 三元运算符
         */

        t = 5;

        String result = t + 1 == 6 ? "666" : "777";
        System.out.println(result);


    }
}
