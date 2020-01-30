import java.util.HashMap;
import java.util.Map;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/27
 * 0:49
 */
public class HashMapInHashMap {
    public static void main(String[] args) {
        Map<String, HashMap<String, Integer>> mapMap = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        map1.put("1", 1);
        map1.put("3", 3);
        map2.put("5", 5);
        map2.put("7", 7);
        mapMap.put("big", map1);
        mapMap.put("samll", map2);
        for (String s : mapMap.keySet()) {
            HashMap hashMap=mapMap.get(s);
            System.out.println(s);
            for (Object o : hashMap.keySet()) {
                System.out.println("\t"+o+"====="+hashMap.get(o));
            }
        }
    }
}
