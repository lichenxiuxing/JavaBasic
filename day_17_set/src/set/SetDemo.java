package set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/24
 * 0:55
 */
public class SetDemo {
    public static void main(String[] args) {
        //set集合特点：唯一且无序
        //对象遍历
        Person person1 = new Person("zhangSan", 11);
        Person person2 = new Person("zhangSan", 11);
        Person person3 = new Person("zhangS", 12);
        Person person4 = new Person("zangS", 13);
        Set<Person> set = new HashSet<>();
        //在添加元素时，需要先判断哈希值，在比较equals方法
        //因此要重写这两个方法，既要保证效率高，也要保证能在成员变量不同的情况下
        //比较出两个元素的不同
        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);
        for (Person person : set) {
            System.out.println(person);
        }

    }
}
