package Demo02;
/*
    方法:

    1.概念:就是一段代码,用{}括起来,起个名字,方便使用

    2.格式:
        修饰符 返回值类型 方法名称(参数列表) {
            方法体;
            return 返回值;
        }

    3.方法可以理解为工厂

        生产汽车的工厂
            原材料:        发动机 变速箱 轮胎 车体 等等....
            产出物:        S650    BMW750Li  T700
        榨汁机
            原材料:        水果  水   调料
            产出物:        果汁

        对应到方法中:
            原材料,进入方法的东西(内容),叫参数
            产出物,从方法中出来的东西(内容),返回值

    4.方法格式的解释
        (1)修饰符:public static 目前固定写法
        (2)返回值类型:方法的功能代码执行完毕后,返回给调用者的结果的数据类型
        (3)方法名称:就是一个标识符,方便使用(小驼峰)
        (4)参数列表:在使用方法时,需要传递给方法的数据
        (5)方法体:完成具体功能的代码
        (6)return 返回值;
            a.结束方法
            b.把返回值,返还给调用者

    5.定义方法明确三要素
        (1)返回值类型
        (2)方法名称
        (3)参数列表

    6.练习:
        定义一个方法,求两个int数据之和,并将结果返回给调用者

 */
public class Demo03Method {
    public static void main(String[] args) {
        //调用方法
        int result = getSum(20,30);
        System.out.println("和：" + result);
        System.out.println("==================");
        int result1 = getSum(40,70);
        System.out.println("和：" + result1);
        System.out.println("==================");
        int num1 = 34, num2 = 45;
        int result3 = getSum(num1,num2);
        System.out.println(result3);
    }

    //定义有返回值的方法
    public static int getSum(int n, int m){
        int sum = n + m;
        return sum;
    }
}
