package objectIOStreamText;

import java.io.*;

/**
 * description: ObjectInputStreamText01 <br>
 * date: 2020/9/29 18:32 <br>
 * author: 文帝 <br>
 * version: 1.0 <br>
 */
//序列化对象。反序列对象
public class ObjectInputStreamText01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student(12,"张三");
        ObjectOutputStream students = new ObjectOutputStream(new FileOutputStream("students"));
        students.writeObject(student);
        students.flush();//D:\编程\new01\new02\iooo
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("students"));
        Object read = inputStream.readObject();
        System.out.println(read);
        students.close();//D:\编程\new01\students
    }
}
