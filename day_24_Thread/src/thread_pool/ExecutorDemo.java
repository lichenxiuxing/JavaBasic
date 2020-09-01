package thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/1
 * 12:47
 */
public class ExecutorDemo {
    public static void main(String[] args) {
        //public static ExecutorService newFixedThreadPool(int i);
        //Excutors是工具类，用于更加方便地创建线程池
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        // public void submit(Runnable r);
        //向线程池中的线程提交任务，会自动开启线程
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());
        //关闭线程池
        executorService.shutdown();
    }
}
