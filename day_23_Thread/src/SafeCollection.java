import java.util.*;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 22:04
 */
public class SafeCollection {
    public static void main(String[] args) {
        //如何使用线程安全的集合
        List<String> list= Collections.synchronizedList(new ArrayList<>());
        Map<String,String> map=Collections.synchronizedMap(new HashMap<>());

    }
}
