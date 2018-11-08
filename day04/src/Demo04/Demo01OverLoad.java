package Demo04;
/*
    1.定义一个方法,获取两个int数据的和
    2.定义一个方法,获取三个int数据的和
    3.定义一个方法,获取两个double数据的和
    4.定义一个方法,获取三个double数据的和

    返现问题:
        以上4个方法的功能相同,都是求和,只是参数不同,但是我们却定义4个不同名称的方法,而且名称很复杂,太长,
        这样程序员记不住,太麻烦?
    如何解决呢?
        方法重载(OverLoad)
 */
public class Demo01OverLoad {
    public static void main(String[] args) {
        //调用方法
        System.out.println(getIntTwoSum(10,20));
        System.out.println("===============");

        System.out.println(getIntThreeSum(20,30,40));
        System.out.println("================");

        System.out.println(getDoubleTwoSum(30.3,40.3));
        System.out.println("===================");

        System.out.println(getDoubleThreeSum(30.4,40.5,50.6));
        System.out.println("==================");
    }

    //定义方法
//    1.定义一个方法,获取两个int数据的和
    public static int getIntTwoSum(int a, int b){
        int sum = 0;
        sum = a + b;
        return sum;
    }

//    2.定义一个方法,获取三个int数据的和
    public static int getIntThreeSum(int a, int b, int c){
        int sum = 0;
        sum = a + b + c;
        return sum;
    }

//    3.定义一个方法,获取两个double数据的和
    public static double getDoubleTwoSum(double a, double b){
        double sum = 0;
        sum = a + b;
        return sum;
    }

//    4.定义一个方法,获取三个double数据的和
    public static double getDoubleThreeSum(double a, double b, double c){
        double sum = 0;
        sum = a + b + c;
        return sum;
    }
}
