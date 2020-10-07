package file;

import java.io.File;
import java.io.IOException;

/**
 * description: FileText01 <br>
 * date: 2020/9/29 16:37 <br>
 * author: 文帝 <br>
 * version: 1.0 <br>
 */
public class FileText01 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\file");
        //判断file是否存在,如果不存在，则会创建文件
      /*  if (!file.exists()){
            file.createNewFile();
        }*/
       /* if (!file.exists()){
            file.mkdir();
        }
        File file1 = new File("D:\\a\\b\\c");
        if (!file1.exists()) {
            file1.mkdirs();
        }*/
       //file.listfiles();获取当前目录下的子文件
    }
}
