import java.util.*;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/7/12
 * 16:20
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();//1.8中不是循环链表，添加了头节点和尾节点
        list.add("a");//添加节点，在最后添加
        list.get(0);//从后往前寻找，或从前往后寻找
        list.set(0,"b");//node属性没有变，改变的是node.val。
        String s = null;
        list.add(s);//节点可以为null.
        list.remove(0);//通过下标找到节点，再进行移除
        //get、set方法不改变链表和数组的结构，不会引起下标越界错误，因此不会产生并发修改异常
        Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> deque1 = new ArrayDeque<>();
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue1 = new ArrayDeque<>();
        for (String s1 : list) {
            
        }
    }
}
