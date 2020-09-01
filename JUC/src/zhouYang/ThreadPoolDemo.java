package zhouYang;

import java.util.concurrent.*;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/11
 * 12:00
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,
                5,//队列满了才会创建新线程
                2,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy());//抛弃最老的
        //ThreadPoolExecutor.DiscardPolicy() 抛弃多余线程
        // ThreadPoolExecutor.CallerRunsPolicy()将多余的线程回退到调用者执行
        //ThreadPoolExecutor.AbortPolicy(),线程数大于队列+maximum时，报错
        }
}
