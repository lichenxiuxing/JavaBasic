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
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        // public void submit(Runnable r);
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());
        executorService.shutdown();
    }
}
