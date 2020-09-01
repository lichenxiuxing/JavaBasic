package zhouYang;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/7/9
 * 22:00
 */
public class CollectionSafe {
    public static void main(String[] args) {
        List list = new CopyOnWriteArrayList();//写时复制
        Set set = new CopyOnWriteArraySet();
        Map map = new ConcurrentHashMap<>();
        //Collections.synchronizedList(new ArrayList<>());
        //new ArrayList<>();
        for (int i = 0; i <= 30 ; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            },String.valueOf(i)).start();

        }
    }
}
