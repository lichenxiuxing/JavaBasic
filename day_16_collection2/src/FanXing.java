import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 13:29
 */
public class FanXing {
    public static void main(String[] args) {
        //泛型，将运行期需要进行的工作提前到了编译期
        //泛型：即参数化类型，把类型明确的工作推迟到创建对象或者调用方法时。
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
