package first;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

//        bubbleSort();
//        selectSort();
//        multiplicationTable();
//        BubbleSort.primeNumber();
        int a=10;
        int sum = sum(a);
        System.out.println(sum);

    }

    public static void bubbleSort() {
        int[] ints = new int[5];
        System.out.println("冒泡排序");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();

        }
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int t = ints[j + 1];
                    ints[j + 1] = ints[j];
                    ints[j] = t;
                }
            }
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static void selectSort() {
        int[] ints = new int[5];
        System.out.println("选择排序");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();

        }
        for (int index = 0; index < ints.length - 1; index++) {
            for (int i = 1 + index; i < ints.length; i++) {
                if (ints[index] > ints[i]) {
                    int t = ints[i];
                    ints[i] = ints[index];
                    ints[index] = t;
                }
            }
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static void multiplicationTable() {
        System.out.println("99乘法表");
        for (int i = 1; i <= 9; i++) {
            System.out.println("\n");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "  ");
            }
        }

    }

    public static void primeNumber() {
        System.out.println("100以内的素数每5个输出");
        int i = 2;
        int a = 0;
        for (; i <= 100; i++) {
            boolean sushu = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sushu = false;
                    break;
                }
            }
            if (sushu) {
                a++;
                System.out.print(i + "  ");
                if ((a) % 5 == 0) {
                    System.out.println("\n");
                }
            }
        }
    }

    public  static  int sum(int a){
        System.out.println("求0到n的数字之和采用递归的方式");
        if (a==1){
            return 1;
        }
     return   a + sum(a - 1);
    }
}
