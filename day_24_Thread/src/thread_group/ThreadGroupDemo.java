package thread_group;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/1
 * 12:12
 */
public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup threadGroup=new ThreadGroup("firstGroup");
        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(threadGroup,myRunnable,"zhangSan");
        Thread thread1=new Thread(threadGroup,myRunnable,"liSi");
        thread.start();
        thread1.start();
        //线程池的作用
        //threadGroup.setDaemon(true);
    }
}
