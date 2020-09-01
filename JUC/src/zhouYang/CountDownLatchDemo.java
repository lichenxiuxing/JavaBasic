package zhouYang;

import java.util.concurrent.CountDownLatch;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/11
 * 0:05
 */
//用作闭锁，在多线程执行完之后，再执行主线程任务
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                    System.out.println(-1);
                    countDownLatch.countDown();

            }).start();
        }
        try {
            countDownLatch.await();//在线程都执行完之后释放
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(2);
    }
}
