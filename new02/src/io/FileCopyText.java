package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * description: FileCopyText <br>
 * date: 2020/9/28 19:52 <br>
 * author: 文帝 <br>
 * version: 1.0 <br>
 */
public class FileCopyText {
    public static void main(String[] args) {
        FileInputStream inputStream=null;
        FileOutputStream outputStream=null;
        try {
             inputStream = new FileInputStream("new02/io");
             outputStream = new FileOutputStream("new02/ioo");
            byte[] bytes = new byte[1024 * 1024];
            int readCount=0;
            if ((readCount=inputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,readCount);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(inputStream==null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
            }
            if (outputStream == null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            }
        }
    }
}
