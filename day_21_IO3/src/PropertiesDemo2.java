import java.util.Properties;
import java.util.Set;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/30
 * 21:48
 */
public class PropertiesDemo2 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        //存放的键值都是字符串
        properties.setProperty("张三", "30");
        properties.setProperty("李四", "40");
        properties.setProperty("王五", "50");
        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            String value=properties.getProperty(string);
            System.out.println(string+"======="+value);
        }
    }
}
