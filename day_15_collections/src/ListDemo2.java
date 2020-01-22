import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 0:42
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");
        //listIterator特有功能 previous,但需要先将指针指向集合的最后
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("==================");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
