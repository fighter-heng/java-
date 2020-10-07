package objectIOStreamText;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * description: ObjectOutputStreamText02 <br>
 * date: 2020/9/29 20:16 <br>
 * author: 文帝 <br>
 * version: 1.0 <br>
 */
//序列化多个对象
    //不使用集合，存第二个对象会报错
public class ObjectOutputStreamText02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(22,"liuheng"));
        students.add(new Student(23,"erdan"));
        students.add(new Student(24,"jialiu"));
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("studentss"));
        outputStream.writeObject(students);
        outputStream.flush();
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("studentss"));
        ArrayList<Student> o = (ArrayList<Student>) inputStream.readObject();
        for (Student student : o) {
            System.out.println(student);
        }
        outputStream.close();

    }
}
