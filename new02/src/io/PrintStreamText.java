package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * description: PrintStreamText <br>
 * date: 2020/9/28 21:43 <br>
 * author: 文帝 <br>
 * version: 1.0 <br>
 */
//标准输出流默认输出到控制台
public class PrintStreamText {
    public static void main(String[] args) throws FileNotFoundException {
        //标准输出流不需要关闭
        PrintStream printStream = new PrintStream(new FileOutputStream("write.txt"));
        PrintStream out = System.out;
        System.setOut(printStream);
        out.println(2);
    }
}
