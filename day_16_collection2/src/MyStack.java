import java.util.LinkedList;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 13:08
 */
public class MyStack {
    private LinkedList linkedList;
    public MyStack(){
        linkedList=new LinkedList();
    }
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
    public void add(Object o){
        linkedList.addFirst(o);
    }
    public Object get(){
        if(this.isEmpty()){
            return "栈已空";
        }else {
            return linkedList.removeFirst();
        }
    }
}
class StackDemo{
    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        myStack.add("hello");
        myStack.add("world");
        myStack.add("java");
        System.out.println(myStack.get());
        System.out.println(myStack.get());
        System.out.println(myStack.get());
        System.out.println(myStack.get());
    }
}
