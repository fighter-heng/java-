package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * description: BufferReaderText01 <br>
 * date: 2020/9/28 20:42 <br>
 * author: 文帝 <br>
 * version: 1.0 <br>
 */
//当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流
//外部负责包装的这个流叫做：包装流/处理流
//fileReader就是节点流，BufferReader就是处理流
    //带有缓冲区的流不需要带有char[]和byte[]数组
public class BufferReaderText01 {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        BufferedReader reader=null;
        try {
            fileReader = new FileReader("new02\\io");
             reader = new BufferedReader(fileReader);//构造方法只能传一个Reader in)
             //通过源代码分析，包装流只需要关掉最外面的流，里面的不需要关闭，底层关闭了
        //    String s = reader.readLine();//读取一个文本行，不带换行符
         //   System.out.println(s);
            String s=null;
            while((s =reader.readLine())!=null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }


    }

}
