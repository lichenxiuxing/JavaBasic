import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/26
 * 23:18
 */
public class MapBasic1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "2");
        map.put("3", "4");
        map.put("5", "6");
        map.put("7", "8");
        //方式1，遍历map,分别得到键,由键找值
        Set<String> strings = map.keySet();
        //Collection<String> strings1 = map.values();
        for (String string : strings) {
            System.out.println(string + "-----------" + map.get(string));
        }
        System.out.println("_____________");
        //方式2，直接遍历键值对，得到键值对set
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> stringStringEntry : set) {
            String s=stringStringEntry.getKey();
            String s1=stringStringEntry.getValue();
            System.out.println(s+"----------"+s1);

        }
    }
}
