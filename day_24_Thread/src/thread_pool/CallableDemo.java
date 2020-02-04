package thread_pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/1
 * 13:01
 */
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(new MyCallable(1, 100));
        Future<Integer> future1 =executorService.submit(new MyCallable(100, 200));
        System.out.println(future.get());
        System.out.println(future1.get());
    }
}
