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
        有返回值的方法,可以采用赋值调用,打印调用,单独调用,但是单独调用,没有意义
        所以:有返回值的方法建议采用赋值调用,打印调用

  alt+回车:自动分配变量

 */
public class Demo04Method {
    public static void main(String[] args) {
    //调用方法
    //赋值调用
        int result = getSum(10,20);
        System.out.println(result);
    //打印调用
        System.out.println(getSum(30,60));
    //单独调用
        getSum(40,45);

    }
    //定义方法
    public static int getSum(int a, int b){
        //定义sum变量，计算a与b的和
        int sum = a + b;
        //返回值
        return sum;
    }
}
