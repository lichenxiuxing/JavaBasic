/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 16:40
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread thread=new Thread(myRunnable,"first");
        Thread thread1=new Thread(myRunnable,"second");
        thread.start();
        thread1.start();
    }
}
