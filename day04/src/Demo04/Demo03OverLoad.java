package Demo04;
/*
    定义方法,比较两个数据是否相等,并将最终结果返回给调用者
    参数类型分别为
    两个byte类型，
    两个short类型，
    两个int类型，
    两个long类型，
 */
public class Demo03OverLoad {
    public static void main(String[] args) {
        //调用方法
        System.out.println(getSame((byte)20,(byte)10));
        System.out.println(getSame(10,10));
        System.out.println(getSame(20L,30L));
        System.out.println(getSame((short)30,(short)30));
    }

    //定义方法
    public static boolean getSame(byte a,byte b){
        return a == b;
    }

    public static boolean getSame(int a,int b){
        //三元
        boolean bo = (a == b ) ? true : false;
        return bo;
    }

    public static boolean getSame(short a, short b){
        if(a == b)
            return true;
            return false;
    }

    public static boolean getSame(long a, long b){
        boolean bo = true;
        if(a == b){
            bo = true;
        }else{
            bo = false;
        }
        return bo;
    }
}
