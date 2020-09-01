package day_01;

import java.util.concurrent.CountDownLatch;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/1
 * 19:15
 * 闭锁，是一种辅助锁，用于等待其他线程执行完毕后，再执行剩余的线程
 */
public class CountDownLatchTest {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        ThreadDemo2 threadDemo2 = new ThreadDemo2(countDownLatch);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            new Thread(threadDemo2).start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("线程已执行完毕");
        System.out.println(end - start);
    }
}

class ThreadDemo2 implements Runnable {
    CountDownLatch countDownLatch;

    public ThreadDemo2(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                for (int i = 0; i < 4000; i++) {
                    System.out.println(i);
                }
            } finally {
                countDownLatch.countDown();
            }
        }
    }
}
