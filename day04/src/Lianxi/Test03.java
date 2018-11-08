package Lianxi;

public class Test03 {
    public static void main(String[] args) {
        //调用方法
//        System.out.println(getChar(100));
//        System.out.println(getString(100));
        char str1 = ' ';
        str1 = getChar(100);
        System.out.println("字符:" + str1);

        String str2 = getString(100);
        System.out.println("字符串:" + str2);

    }

    //定义方法
    public static char getChar(int a){
        if (a >= 97 && a <= 122){
            return (char) a;
        }else if (a >= 65 && a <= 90){
            return (char) a;
        }else if (a >= 48 && a <= 57){
            return (char)a;
        }else  {
            System.out.println(' ');
        }
        return (char) a;
    }

    public static  String getString(int s){
        String str = "";
        for(int i = 0; i < 4;i++) {
            if (s >= 97 && s <= 122) {
                str = str + (char)s;
            } else if (s >= 65 && s <= 90) {
                str = str + (char)s;
            } else if (s >= 48 && s <= 57) {
                str = str + (char)s;
            }else{
                str = " ";
            }
        }
        return str;
    }
}
