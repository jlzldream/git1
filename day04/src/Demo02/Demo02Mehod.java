package Demo02;
/*
    方法注意:
    1.方法不调用,不执行
        调用格式:方法名称()
    2.方法可以嵌套调用,但是不能嵌套定义
    3.同一个方法可以被调用多次
    4.也可以调用多个不同的方法


    alt+insert:  创建包/类
 */
public class Demo02Mehod {
    public static void main(String[] args) {
        //调用方法
        printStarts(5,8);
        System.out.println("================");
        printStarts(15,20);
    }
    public static void printStarts(int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return ;
    }
}
