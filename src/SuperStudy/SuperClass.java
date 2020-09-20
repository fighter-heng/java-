package SuperStudy;

public class SuperClass    {
    public static void main(String[] args) {
        new B();
    }
}
class A{
    public  A(){
        System.out.println( "A的无参构造");
    }
}
class B extends A{
    public B() {
//        super();//规定自动有一个super;默认调用的是父类的无参构造
//        //this();调用本类中其他的构造方法
        this(12);
        System.out.println("B的无参构造");
    }
    public B(int a){
        System.out.println("有参构造执行");
    }
}