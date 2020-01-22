import java.util.ArrayList;
import java.util.List;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 0:28
 * list特点：可重复，有序
 */
public class ListDemo {
    public static void main(String[] args) {
        //list特有功能
        List list=new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add(1,"java");
        //list.remove(2);
        System.out.println(list.get(1));
        list.set(1,"ajie");
        System.out.println(list);
        //list的特有遍历功能
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
