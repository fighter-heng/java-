package first;
public class Project02 {
    public static void main(String[] args) {
        System.out.println(recursion(3));
    }
    public static int recursion(int a){

        return recursion(a-1)  ;
    }
}


