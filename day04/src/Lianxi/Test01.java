package Lianxi;

public class Test01 {
    public static void main(String[] args) {
        int a = 10, b = 10;
        printNum(a,b);
        doubling(a,b);
        printNum(a,b);
        //接收返回值
        a = doubling(a);
        b = doubling(b);
        System.out.println("================");
        printNum(a,b);
    }

    //定义方法
    public static void printNum(int iVar, int iVar2){
        System.out.print("iVar:" + iVar + ",");
        System.out.println("iVar2:" + iVar2);
    }

    public static void doubling(int r, int p){
        r = r * 2;
        p = p * 2;
        printNum(r,p);
    }

    public static int doubling(int r ){
        r = r * 2;
        return r;
    }
}
