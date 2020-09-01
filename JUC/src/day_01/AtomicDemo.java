package day_01;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/1
 * 18:38
 */
public class AtomicDemo {
    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        for (int i = 0; i < 10; i++) {
            new Thread(threadDemo1) {
            }.start();
        }
    }
}

class ThreadDemo1 implements Runnable {
    //通过原子变量来避免内存安全问题
    //原子变量：1，使用了volatile关键字；2，使用了cas算法
    public AtomicInteger i = new AtomicInteger();

    @Override
    public void run() {
        i.getAndIncrement();
        System.out.println(i);
    }
}