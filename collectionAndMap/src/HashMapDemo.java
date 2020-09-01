import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/7/12
 * 19:16
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //存放位置的hash值是经过变换的，即是node节点的hash值
        //判断key是否相等是直接使用hash值
        Map<String, String> map1 = new LinkedHashMap<>();
    }
}
