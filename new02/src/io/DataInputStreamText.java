package io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * description: DataInputStreamText <br>
 * date: 2020/9/28 21:28 <br>
 * author: 文帝 <br>
 * version: 1.0 <br>
 */
public class DataInputStreamText {//数据专属流
    //这个流可以将数据连同数据类型一并写入文件
    //这个文件不是普通文档
    //只能通过DataInputStream去读，并且读的时候你需要提前知道写入的顺序，读的顺序需要和写入的顺序一致，才能正确取出数据

    public static void main(String[] args) throws IOException {
        DataOutputStream data = new DataOutputStream(new FileOutputStream("new02\\io"));
        byte a=100;
        short b=200;
        int c=300;
        float d=3.0F;
        double e=3.14D;
        data.writeByte(a);
        data.writeShort(b);
        data.writeInt(c);
        data.writeDouble(e);
        data.writeFloat(d);
    }
}
