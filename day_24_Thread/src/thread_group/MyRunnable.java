package thread_group;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/1
 * 12:12
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getThreadGroup().getName());
    }
}
