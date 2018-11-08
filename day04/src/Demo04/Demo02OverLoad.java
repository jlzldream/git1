package Demo04;
/*
   方法重载(OverLoad)

   1.概念:在同一个类中(目前),多个功能相同的方法,参数不同的方法,允许使用相同的方法名称,这种现象叫做,方法重载

   2.参数列表不同有哪些情况呢?
        (1)数量不同
        (2)类型不同
        (3)多个类型,顺序不一致

   3.与哪些因素无关
        (1)与返回值类型无关
        (2)与参数的名称无关
        (3)修饰符无关

 */
public class Demo02OverLoad {
    public static void main(String[] args) {
        //调用方法
        System.out.println(getSum(10,20));
        System.out.println(getSum(10.3,30.3));
        System.out.println(getSum(20,30,40));
        System.out.println(getSum(20.4,30.4,50.5));
    }

    //方法定义
    public static int getSum(int a, int b){
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public static int getSum(int a, int b, int c){
        int sum = 0;
        sum = a + b + c;
        return sum;
    }

    public static double getSum(double a, double b){
        double sum = 0;
        sum = a + b;
        return sum;
    }

    public static double getSum(double a, double b, double c){
        double sum = 0;
        sum = a + b + c;
        return sum;
    }
}
