import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/27
 * 1:18
 * HashMap:线程不安全，效率高，允许null作为键和值
 * HashTable:线程安全，效率低，不允许不允许null作为键和值
 */
public class HashTableDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put(null, "hello");
        map.put("world", null);
        System.out.println(map);
        Map<String, String> hashTable = new Hashtable<>();
        hashTable.put(null,"java");//NullPointerException
        hashTable.put("javaee",null);//NullPointerException
        System.out.println(hashTable);
    }
}
