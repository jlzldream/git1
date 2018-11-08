package Lianxi;

public class Trst04 {
    public static void main(String[] args) {
        //调用方法
        showColor("red");

    }

    //定义方法
    public static void showColor(String a){
        switch(a){
            case "red":
                System.out.println(a + "是红色！");
                break;
            case "green":
                System.out.println(a + "是绿色！");
        }
    }
}
