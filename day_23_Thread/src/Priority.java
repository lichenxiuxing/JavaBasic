/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 14:56
 * 线程优先级的测试：最高10，最低1，默认5
 * 仅代表优先级，并非一定按照此来
 */
public class Priority {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        MyThread myThread1=new MyThread();
        MyThread myThread2=new MyThread();

        myThread.setName("first");
        myThread1.setName("second");
        myThread2.setName("third");

        myThread.setPriority(10);
        myThread2.setPriority(1);
        myThread.start();
        myThread1.start();
        myThread2.start();
    }
}
