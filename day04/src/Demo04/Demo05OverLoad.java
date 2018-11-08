package Demo04;

import java.sql.SQLOutput;

/*
    题目要求：实现一些重载形式的方法showData，可以打印指定的数据。

    这些数据可以是：boolean、float、double

 */
public class Demo05OverLoad {
    public static void main(String[] args) {
        //调用方法
        System.out.println(true);
        System.out.println(33F);
        System.out.println(44.4);
        System.out.println("=================");
        showData(true);
        showData(22F);
        showData(30.4);
    }

    //定义方法
    public static void showData(boolean a){
        System.out.println(a);
    }

    public static void showData(float a){
        System.out.println(a);
    }

    public static void showData(double a){
        System.out.println(a);
    }
}
