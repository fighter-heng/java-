public interface InterFText {
    //接口是纯抽象的
    public static final double PI=3.1415926;
    //常量public static final可以省略
    public abstract  void doSome();
    //抽象方法在接口中public abstract可以省略
}
 class A  extends Object implements InterFText,B,C{
  //当一个类继承一个接口，必须实现接口的所有抽象方法。
    @Override
    public void doSome() {
        System.out.println("接口实现了");
    }
//一个类可以继承多个接口，必须重写所有接口的抽象方法。
     @Override
     public void m() { }
     @Override
     public void m1() { }
     public static void main(String[] args) {
         B b = new A();
         C c = new A();
         C c1= (C)b;
         c1.m1();
         //接口与接口之间进行强制转换时候，没有继承关系也可进行强转，相当于爸妈与儿子之间一样
     }
 }
interface B{
    void m();
}
interface C{
    void m1();
}
interface D{
    void m2();
}