package zhouYang;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/7/9
 * 22:45
 */
public class Producer {
    public static void main(String[] args) {
        Source source = new Source();
        new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                try {
                    source.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                try {
                    source.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();
        new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                try {
                    source.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();
        new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                try {
                    source.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "D").start();
    }
}

class Source {
    private int num = 0;
    /*public synchronized void increment() throws InterruptedException {
        //多线程的交互判断必须用while
        while (num != 0) {
            this.wait();
        }
        num++;
        System.out.println(Thread.currentThread().getName() + "\t" + num);
        this.notifyAll();
    }
    public synchronized void decrement() throws InterruptedException {
        while (num == 0) {
            this.wait();
        }
        num--;
        System.out.println(Thread.currentThread().getName() + "\t" + num);
        this.notifyAll();
    }*/
    private Lock lock = new ReentrantLock();
    private Condition product = lock.newCondition();
    private Condition consume = lock.newCondition();

    public void increment() throws InterruptedException {
        lock.lock();
        try {
            while (num != 0) {
                product.await();
            }
            num++;
            System.out.println(Thread.currentThread().getName() + "\t" + num);
            consume.signal();
        } finally {
            lock.unlock();
        }
    }

    public void decrement() throws InterruptedException {
        lock.lock();
        try {
            while (num == 0) {
                consume.await();
            }
            num--;
            System.out.println(Thread.currentThread().getName() + "\t" + num);
            product.signal();
        } finally {
            lock.unlock();
        }
    }
}
