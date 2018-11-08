package Demo03;
/*
    比较两个整数是否相同
 */
public class Demo01MethodTest {
    public static void main(String[] args) {
        //调用方法
        //调用无返回值的方法
        printIsSame(10,20);
        System.out.println("=======================");

        //调用有返回值的方法
        System.out.println(getIsSame(20,20));
        System.out.println("====================");
        boolean result2 = getIsSame(30,40);
        System.out.println("相等吗？" + result2);

    }

    //定义方法（无返回值）
    public static void printIsSame(int a, int b){
        boolean result;
        if(a == b){
            result = true;
        }else{
            result = false;
        }
        System.out.println(a + "与" + b + "相等吗？" + result);
    }

    //定义方法（有返回值）
    public static boolean getIsSame(int a, int b){
        //三元运算
        return (a == b) ? true : false;
    }
}
