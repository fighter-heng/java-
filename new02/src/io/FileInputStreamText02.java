package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * description: FileInputStreamText02 <br>
 * date: 2020/9/27 19:09 <br>
 * author: 文帝 <br>
 * version: 1.0 <br>
 */
public class FileInputStreamText02 {
    public static void main(String[] args) {
        FileInputStream stream=null;
        try {
            //当前项目的下的io文件
             stream = new FileInputStream("new02\\io");
            byte[] bytes = new byte[4];
           int read=0;
              while ((read = stream.read(bytes))!=-1){
                  System.out.println(new String(bytes,0,read));
              }
              //方法
            int available = stream.available();//返回流当中剩余没有读到的字节的数量
            System.out.println(available);//不太适合太大的文件byte数组不能太大

            long skip = stream.skip(3);  //跳过3个=-

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (stream!=null){
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
