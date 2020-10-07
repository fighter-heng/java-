package objectIOStreamText;

import java.io.Serializable;

/**
 * description: Student <br>
 * date: 2020/9/29 18:44 <br>
 * author: 文帝 <br>
 * version: 1.0 <br>
 */
//Serializable接口只是一个标志接口，起到标识的作用，JVM看到了这个类实现了这个接口，可能会对这个类进行特殊待遇
 //  JVM看到这个接口之后，会自动生成一个序列化版本号，
    //序列版本号的作用？
    //代码一旦改，序列号改变，建议把序列化版本号固定死
    //java中通过什么机制来区分类的
    /*一：通过类名
    二：类名相同的情况下通过序列版本号
    */
public class Student implements Serializable {
   //idea自动生成序列化版本号
    private static final long serialVersionUID = -4385012087408571911L;
    // private static final long serialVersionUID = 1L;
    int age;
transient    String name;//此关键字表示游离的不参加序列化操作


    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
