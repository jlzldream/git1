package Lianxi;

public class Test02 {
    public static void main(String[] args) {
        //保存返回值并输出
        boolean bo = doCheck(2);
        System.out.println(bo);
        boolean bo1 = doCheck(3);
        System.out.println(bo1);
    }

    //定义方法
    public static boolean doCheck(int iVar){
        boolean flag;
        if(iVar % 2 == 0){
            for(int i = 0; i <= 20; i ++){
                iVar -= i;
            }
            flag = true;
        }else{
            for(int i = 0; i <= 20; i ++){
                iVar += i;
            }
            flag = false;
        }
        System.out.println(iVar);
        return flag;
    }
}
