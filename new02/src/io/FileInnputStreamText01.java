package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * description: FileInnputStreamText01 <br>
 * date: 2020/9/27 17:38 <br>
 * author: 文帝 <br>
 * version: 1.0 <br>
 */
public class FileInnputStreamText01 {
    public static void main(String[] args)  {
        FileInputStream stream =null;

        try {
            //idea默认的当前路径：工程project的跟
            stream = new FileInputStream("C:\\Users\\文帝\\Desktop\\io.txt");
           /* while (true){
                int read = stream.read();//如果没有字节，返回-1
                if (read==-1){
                    break;
                }
                System.out.println(read);
            }*/
           /* int    readData=0;
            while ((readData=stream.read())!=-1){
                System.out.println(readData);
                //一个一个读太麻烦
            }*/
            byte[] bytes = new byte[10];
            int read = stream.read(bytes);   //读到几个字节，返回字节的数量
            System.out.println(read);
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
