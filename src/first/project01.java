package first;

import java.util.Scanner;

public class project01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入天气");
        String s = scanner.next();
        if (s.equals("下雨")){
            System.out.println("请带上雨伞");
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("请输入你的性别");
            String s1 = scanner1.next();
            if (s1.equals("男")){
                System.out.println("带一把小雨伞");
            }else{
                System.out.println("带一把小红伞");
            }
        }else {
            System.out.println("天气的温度在30度以上");
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("请输入你的性别");
            String s2= scanner2.next();
            if (s2=="男"){
                System.out.println("戴墨镜");
            }else{
                System.out.println("涂防晒霜");
            }
        }
    }
}
