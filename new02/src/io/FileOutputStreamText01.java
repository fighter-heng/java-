package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * description: FileOutputStreamText01 <br>
 * date: 2020/9/27 21:15 <br>
 * author: 文帝 <br>
 * version: 1.0 <br>
 */
public class FileOutputStreamText01 {
    public static void main(String[] args) {
        FileOutputStream outputStream=null;
        try {
            outputStream = new FileOutputStream("outio",true);
            byte[] bytes = new byte[]{97,98,99,100};
            outputStream.write(bytes,0,bytes.length);
           String a="我是一个中国人";
            byte[] bytes1 = a.getBytes();
            outputStream.write(bytes1);


            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
