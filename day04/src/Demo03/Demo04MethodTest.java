package Demo03;
/*
    方法的注意事项:
    1.定义位置，类中方法外面
    2.返回值类型，必须要和return语句返回的类型匹配，否则编译失败
    3.不能在return 后面写代码，return 意味着方法结束，所有后面的代码永远不会执行，属于无效代码
    4.有返回值的方法,必须保证在任何情况下,有且仅有一条return会被执行

 */
public class Demo04MethodTest {
    public static void main(String[] args) {
        //调用方法
        m1();
        System.out.println("===============");

        System.out.println(m2());
        System.out.println("================");

        //赋值调用
        boolean b = m3(20,30);
        System.out.println(b);
    }

    //定义方法
    public static void m1(){
        System.out.println("m1");
        return;
    }

    public static int m2(){
        System.out.println("m2");
        return 0;
    }

    public static boolean m3(int a, int b){
        if(a == b)
            return true;
            return false;
    }
}
