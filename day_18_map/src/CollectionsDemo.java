import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/27
 * 1:29
 * Collections:是Collection的工具集合类
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(20);
        list.add(40);
        System.out.println(list);
        //System.out.println(Collections.binarySearch(list, 20));先排序，再查找
        //Collections.sort(list);
        //System.out.println(list);
        Collections.reverse(list);
        Collections.shuffle(list);
    }
}
