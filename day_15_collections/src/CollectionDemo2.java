import java.util.ArrayList;
import java.util.Collection;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/22
 * 23:14
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection collection1 = new ArrayList();
        Collection collection2 = new ArrayList();
        collection1.add("java1");
        collection1.add("java2");
        collection1.add("java3");
        collection1.add("java4");
        collection2.add("java4");
        collection2.add("java5");
        collection2.add("java6");
        collection2.add("java7");
        //System.out.println(collection1.addAll(collection2));
        //System.out.println(collection1.containsAll(collection2));
        //System.out.println(collection1.removeAll(collection2));
        //返回值为collection1是否发生改变，
        System.out.println(collection1.retainAll(collection2));
        System.out.println(collection1);
        System.out.println(collection2);
    }
}
