package arraylist;

public class ArrayText01 {
    public static void main(String[] args) {
         if(!(args.length==2)){
             System.out.println("请输入正确的用户名和密码：例如 zhangsan  133 ");
         }
         String a=args[0];
         String b= args[1];
         if (a=="liuheng"&&b=="123"){
             System.out.println("密码正确");
         }
         //下列程序为数组的拷贝
        int[] ints = new int[]{1,1,3,4};
        int[] ints1 = new int[6];
        System.arraycopy(ints,0,ints1,1,3);
        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i]+"  ");
        }
        //5个参数第一个数组对象A,第二个是源的起点下标，第三个为拷贝目标对象，
        //第四个目标的起始下标，第五个为拷贝的长度。
//         printArry(new int[]{1,2,3,4});
        System.out.println("\n");
        int[][] ints2 = new int[][]{ints,ints1};
        System.out.println(ints2.length);
        printArry(ints2);
    }
    public  static void printArry(int [][] c){
        for (int i = 0; i <c.length ; i++) {
            for (int j = 0; j <c[i].length ; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
