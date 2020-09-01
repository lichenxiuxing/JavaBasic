import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/7/11
 * 18:52
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//1.8默认是0，添加时再扩容，是一种懒加载对思想。
        //使用无参构造器时在add时自动扩容到10.
        //使用int构造器不够时扩容，每次1.5倍
        list.add("a");//modcount++
        list.add("aaa");
        list.add("aa");
        list.get(0);//就是简单地从数组中获得下标为1的数
        //list.set(5,"b");//只能在已有的size内添加
        list.remove(0);//比linkedlist块modcount++
        list.remove("a");//也要遍历，应该与linkedlist一样
        list.contains("a");//也是遍历
        for (String s : list) {

        }
        Vector<Integer> vector = new Vector<>();
    }
}
