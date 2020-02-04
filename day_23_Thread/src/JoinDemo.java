/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 15:22
 */
public class JoinDemo {
    public static void main(String[] args) {
        MyThread1 myThread=new MyThread1();
        MyThread1 myThread1=new MyThread1();
        MyThread1 myThread2=new MyThread1();

        myThread.setName("first");
        myThread1.setName("second");
        myThread2.setName("third");
        try {
            //只有此线程执行完毕后，其后的其它线程才会执行
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.start();
        myThread1.start();
        myThread2.start();
    }
}
