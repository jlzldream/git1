package Demo04;

/*
    判断哪些方法是重载关系
    1. 3和8只有参数名称不同,不能构成重载,只能二选一(选3)
    2. 5和6只有参数名称不同,不能构成重载,只能二选一(选5)
    3. 7的方法名称和其它方法不一样,虽然可以存在,但是和其它方法没有构成重载
 */
public class Demo04OverLoad {
    public static void main(String[] args) {

    }
    //1
    public static void open(){}
    //2
    public static void open(int a){}
    //3
    static void open(int a,int b){}
    //4
    public static void open(double a,int b){}
    //5
    public static void open(int a,double b){}
    //6
    //public void open(int i,double d){}//..............
    //7
    public static void OPEN(){}//.................
    //8
    //public static void open(int i,int j){}//.............
}

