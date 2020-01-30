import java.util.LinkedList;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 12:03
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        //可以利用linkedlist的addFirst方法实现栈的功能
        /*linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");
        System.out.println(linkedList);*/
        linkedList.addFirst("hello");
        linkedList.addFirst("world");
        linkedList.addFirst("java");
        for (int i = 0; i <linkedList.size() ; i++) {
            System.out.println(linkedList.get(i));
        }
        //getLast removeLast addLast removeFirst
    }
}
