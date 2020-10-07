package io;

import java.io.*;

/**
 * description: InputStreamReaderText <br>
 * date: 2020/9/28 21:11 <br>
 * author: 文帝 <br>
 * version: 1.0 <br>
 */
public class InputStreamReaderText {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("new02\\src\\io\\InputStreamReaderText.java");
        //我们只能通过转换流将字节流转换为字符流
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);//构造方法只能为Reader
        String s=null;
        while ((s=reader.readLine())!=null){
            System.out.println(s);
        }




        reader.close();
    }
}
