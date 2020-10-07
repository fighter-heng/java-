package file;

import java.io.*;


/**
 * description: FileText02 <br>
 * date: 2020/9/29 17:12 <br>
 * author: 文帝 <br>
 * version: 1.0 <br>
 */
public class FileText02 {
    public static void main(String[] args) {
        File file = new File("D:\\英雄时刻");
        File file1 = new File("c:\\");
        //获取源下面的字目录
      copyFile(file,file1);
    }

    private static void copyFile(File file, File file1) {
        if(file.isFile()){//递归如果是文件递归结束
            try {
                FileInputStream inputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(file1.getAbsolutePath()+file.getAbsolutePath().substring(3));
                byte[] bytes = new byte[1024 * 1024];
                int  readCount=0;
                while ((readCount=inputStream.read(bytes))!=-1){
                  fileOutputStream.write(bytes,0,readCount);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }
        File[] files = file.listFiles();
        for (File file2 : files) {
            if (file2.isDirectory()){
                String absolutePath = file2.getAbsolutePath();//获取所有文件的绝对路径
                String s = absolutePath.substring(3);
                String b =file1.getAbsolutePath()+s;
                System.out.println(b);
                File file3 = new File(b);
                if (!file3.exists()){
                    file3.mkdirs();
                }

            }

            copyFile(file2,file1);
        }

    }
}
