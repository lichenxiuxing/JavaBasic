import java.util.ArrayList;
import java.util.Collection;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/22
 * 22:57
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        //boolean add(Object o)
        collection.add("hello");
        collection.add("world");
        collection.add("java");
        System.out.println(collection);
        //collection.clear();清除集合中所有元素
        //System.out.println(collection);
        collection.remove("hello");
        System.out.println(collection);
        System.out.println(collection.contains("java"));
        System.out.println(collection.size());
    }
}
