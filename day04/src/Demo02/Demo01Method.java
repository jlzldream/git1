package Demo02;
/*
    方法注意:
    1.方法不调用,不执行
        调用格式:方法名称()
    2.方法可以嵌套调用,但是不能嵌套定义
    3.同一个方法可以被调用多次
    4.也可以调用多个不同的方法


    alt+insert:  创建包/类
 */

public class Demo01Method {
    public static void main(String[] args) {
        //方法调用
        printStarts();
        System.out.println("=============");
        printStarts();
        System.out.println("=============");
        printStarts();
        System.out.println("=============");
        m1();
        m2();
    }
    /*
    方法注意:
    1.方法不调用,不执行
        调用格式:方法名称()
    2.方法可以嵌套调用,但是不能嵌套定义
    3.同一个方法可以被调用多次
    4.也可以调用多个不同的方法


    alt+insert:  创建包/类
 */
    public static void printStarts(){
        //打印5*8的星星矩阵
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 8; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return;
    }
    public static void m1(){
        System.out.println("m1");
    }
    public static void m2(){
        System.out.println("m2");
    }
}
