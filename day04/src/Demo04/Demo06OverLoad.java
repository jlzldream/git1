package Demo04;
/*
    Math类中定义了一些重载的方法
    max:求两个数据的最大值
    1.public static double max(double a,double b):返回两个 double 值中较大的一个
    2.public static float max(float a,float b):返回两个 float 值中较大的一个
    3.public static int max(int a,int b):返回两个 int 值中较大的一个
    4.public static long max(long a,long b):返回两个 long 值中较大的一个

    min:求两个数据的最小值
    1.public static double min(double a,double b):返回两个 double 值中较小的一个
    2.public static float min(float a,float b):返回两个 float 值中较小的一个
    3.public static int min(int a,int b):返回两个 int 值中较小的一个
    4.public static long min(long a,long b):返回两个 long 值中较小的一个
 */
public class Demo06OverLoad {
    public static void main(String[] args) {
        System.out.println(Math.max(20,10));
        System.out.println(Math.max(30.3,30.9));
        System.out.println(Math.max(30L,89L));
        System.out.println(Math.max(40F,40F));
        System.out.println("===========================");

        System.out.println(Math.min(10,20));
        System.out.println(Math.min(40.4,40.8));
        System.out.println(Math.min(30L,70L));
        System.out.println(Math.min(50F,67F));
    }
}
