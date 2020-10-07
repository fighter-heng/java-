package objectIOStreamText;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * description: IoPropertiestText01 <br>
 * date: 2020/9/29 21:01 <br>
 * author: 文帝 <br>
 * version: 1.0 <br>
 */
//经常变化的数据，放到配置文件中，配置文件要求.properties结尾，属性配置文件中
// #是注释，key重复，value自动覆盖，最好不要有空格
//不建议使用冒号

public class IoPropertiestText01 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("new02\\userinfo");
        Properties properties = new Properties();
        properties.load(inputStream);
        Set<Object> objects = properties.keySet();
        for (Object object : objects) {
            String property = properties.getProperty((String) object);
            System.out.println(property);
        }
    }
}
