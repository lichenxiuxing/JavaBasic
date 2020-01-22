import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 0:50
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");
        //在迭代器迭代时集合时向集合添加元素
        ListIterator listIterator = list.listIterator();
        //方法1，利用ListIterator的add方法，但会在正在迭代的元素后添加
        /*while (listIterator.hasNext()){
            if(listIterator.next().equals("world")){
                listIterator.add("nihao");
            }
        }
        System.out.println(list);*/
        //方法2，利用集合的get方法进行遍历，会在集合最后添加
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equals("world")){
                list.add("nihao");
            }
        }
        System.out.println(list);
    }
}
