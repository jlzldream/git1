package Demo02;
/*
  方法调用的三种形式:
  1.赋值调用:
        数据类型  变量名称 = 方法名(参数列表);

  2.打印调用:
        System.out.println(方法名(参数列表));

  3.单独调用:
        方法名(参数列表);

    注意:
        没有有返回值的方法,只能单独调用

  alt+回车:自动分配变量

 */
public class Demo05Method {
    public static void main(String[] args) {
        //方法调用(单独调用)
        printSum(10,20);
    }

    //定义方法，无返回值，有参数
    public static void printSum(int a, int b){
        int sum = a + b;
        System.out.println("两数之和为：" + sum);
    }
}
