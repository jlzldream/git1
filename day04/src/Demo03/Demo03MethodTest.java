package Demo03;
/*
    实现不定次数的HelloWorld的打印
 */
public class Demo03MethodTest {
    public static void main(String[] args) {
        //调用方法
        getHelloWorld(10);
        System.out.println("===============");

        int n = getHelloWorld(12);
        System.out.println(n);
        System.out.println("=================");

        System.out.println(getHelloWorld(34));

    }

    //定义方法
    public static int getHelloWorld(int n){
        for(int i = 0; i < n; i ++){
            System.out.println("HelloWorld");
        }
        return n;
    }
}
