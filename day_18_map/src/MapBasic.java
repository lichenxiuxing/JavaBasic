import java.util.HashMap;
import java.util.Map;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/26
 * 23:04
 */
public class MapBasic {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "2");
        map.put("3", "4");
        map.put("5", "6");
        map.put("7", "8");
        System.out.println(map.put("1","9"));//返回原先的值
        System.out.println(map.size());
        System.out.println(map.remove("1"));//返回删除的值
        System.out.println(map);
        map.clear();
        System.out.println(map);
    }
}
