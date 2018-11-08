package Demo03;
/*
    计算1+2+3...+n的和
 */
public class Demo02MethodTest {
    public static void main(String[] args) {
        //调用方法
        //无返回值
        printSum(50);
        System.out.println("================");

        //有返回值
        System.out.println(getSum(100));
        System.out.println("================");
        int sum = getSum(100);
        System.out.println("和为：" + sum);

    }

    //定义方法
    public static void printSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("1~" + n + "的和为：" + sum);
    }
        {
    }

    //定义方法
    public static int getSum(int n){
        int sum = 0;
        for(int j = 50; j <=n; j++){
            sum += j;
        }
        return sum;
    }
}
