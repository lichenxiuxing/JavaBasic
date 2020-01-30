import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/26
 * 23:59
 * LinkedHashMap：有序map,（存取有序）
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("1","2");
        map.put("3","4");
        map.put("5","6");
        map.put("7","8");
        for (String s : map.keySet()) {
            System.out.println(s+"======"+map.get(s));
        }
    }
}
