package SuperStudy;

public class SuperClass01 {
    public static void main(String[] args) {
        Vip vip = new Vip("常铭轩");
        vip.shopping();
        vip.doSome();
        vip.uang();
    }
}
class Customer{
    String name;
    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }
    public  void  doSome(){
        System.out.println(this.name);

//        System.out.println(super.name);报错父类对象中没有name属性
    }
    public void move(){
        System.out.println("常铭轩的爸爸是刘恒");
    }
}
class Vip extends Customer{
    String name;//当子类出现了和父类一样的属性时，子类想访问父类的属性，super.不可省略
    public Vip() {
    }
    public Vip(String name) {
        super(name);
        //访问父类的构造方法的同时，初始化当前类的实例变量
    }
    public  void  shopping(){
        //当子类中有和父类一样的属性，this.访问的是当前属性的默认值
        System.out.println(this.name);
        System.out.println(super.name);
        System.out.println(name);

    }

    @Override
    public void move() {
        System.out.println("鸣轩的儿子是贾刘煜i");
    }
    public void uang(){
        super.move();
        System.out.println(this);

    }
}