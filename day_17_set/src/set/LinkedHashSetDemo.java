package set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/24
 * 1:06
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //LinkedHashSet：有序，唯一，底层由链表和哈希共同维护
        Set<String> strings = new LinkedHashSet<>();
        strings.add("java");
        strings.add("java");
        strings.add("java");
        strings.add("world");
        strings.add("hello");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
