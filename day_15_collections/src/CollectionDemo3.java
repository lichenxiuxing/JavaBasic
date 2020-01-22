import java.util.ArrayList;
import java.util.Collection;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/22
 * 23:26
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        //Object [] toArray()
        Collection collection = new ArrayList();
        collection.add("hello");
        collection.add("java");
        collection.add("world");
        Object[] objects = collection.toArray();
        for (int i = 0; i <objects.length ; i++) {
            String s=(String) objects[i];
            System.out.println(s);
        }
    }
}
