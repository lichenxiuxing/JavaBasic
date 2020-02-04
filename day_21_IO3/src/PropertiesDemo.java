import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/30
 * 21:34
 * Properties是一种特殊的map，可以直接和流进行交互
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        //不是泛型类
        Properties properties = new Properties();
        properties.put("1", "hello");
        properties.put("2", "world");
        properties.put("3", "java");
        /*Set<Object> set = properties.keySet();
        for (Object o : set) {
            String value=(String)properties.get(o);
            String key=(String)o;
            System.out.println(key+"===="+value);
            //遍历方式1
        }*/
        Set<Map.Entry<Object,Object>> set=properties.entrySet();
        for (Map.Entry<Object, Object> objectObjectEntry : set) {
            Object key=objectObjectEntry.getKey();
            Object value=objectObjectEntry.getValue();
            System.out.println(key+"======"+value);
        }
    }
}
