import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/22
 * 23:39
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("hello");
        collection.add("java");
        collection.add("world");
        Iterator iterator=collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
