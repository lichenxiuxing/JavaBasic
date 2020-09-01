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
        myThread.start();
        try {
            //只有此线程执行完毕后，其后的其它线程才会执行
            //真实意义是主线程释放了执行资格和执行权，只有该线程执行完毕后才能重新掌握
            //其他线程并未等待
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread1.start();
        myThread2.start();
    }
}
