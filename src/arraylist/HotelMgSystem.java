package arraylist;

import java.util.Scanner;

public class HotelMgSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println("欢迎使用酒店管理系统");
        System.out.println("请输入对应的功能编号：【1】表示查看功能列表。" +
                "【2】表示订房。【3】表示退房.【0】表示退出系统");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请输入功能编号");
            int i = scanner.nextInt();
            if (i==1)
                hotel.Print();
            else if (i==2){
                System.out.println("请输入订间编号：");
                int s =scanner.nextInt();
                hotel.order(s);
            }
           else if (i==3){
                System.out.println("请输入退间编号：");
                int s= scanner.nextInt();
                hotel.exit(s);
            }
           else if (i==0){
                System.out.println("再见，欢迎下次再来");
            }

        }

    }

}
