/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 15:16
 */
public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadSleep myThread=new ThreadSleep();
        ThreadSleep myThread1=new ThreadSleep();
        ThreadSleep myThread2=new ThreadSleep();

        myThread.setName("first");
        myThread1.setName("second");
        myThread2.setName("third");
        myThread.start();
        myThread1.start();
        myThread2.start();
    }
}
