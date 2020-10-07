package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * description: FileReaderText <br>
 * date: 2020/9/28 20:17 <br>
 * author: 文帝 <br>
 * version: 1.0 <br>
 */
public class FileReaderText {
    public static void main(String[] args) {
        FileReader fileReader=null;
        FileWriter fileWriter=null;
        try {
            fileReader = new FileReader("new02\\io"); //字符流
             fileWriter = new FileWriter("new02\\iooo",true);
            char[] chars = new char[1024 * 1024];//按照字符的顺序读取
            int readFile=0;
            if ((readFile=fileReader.read(chars))!=-1){
                System.out.println(new String(chars,0,readFile));
                fileWriter.write(chars,0,readFile);

            }
            fileWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader==null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
