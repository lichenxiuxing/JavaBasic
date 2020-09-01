package zhouYang;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/7/9
 * 23:30
 */
public class ConditionDemo {
    public static void main(String[] args){
        ClassResource classResource = new ClassResource();
        new Thread(() -> {
            try {
                for (int i = 0; i <10 ; i++) {
                    classResource.print5();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "A").start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    classResource.print10();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "B").start();
        new Thread(() -> {
            try {
                for (int i = 0; i <10; i++) {
                    classResource.print15();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "C").start();
    }
}
class ClassResource {
    private int flag = 1;
    private Lock lock = new ReentrantLock();
    private Condition s1 = lock.newCondition();
    private Condition s2 = lock.newCondition();
    private Condition s3 = lock.newCondition();

    public void print5() throws InterruptedException {
        lock.lock();
        try {
            while (flag != 1) {
                s1.await();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            flag = 2;
            s2.signal();
        } finally {
            lock.unlock();
        }
    }

    public void print10() throws InterruptedException {
        lock.lock();
        try {
            while (flag != 2) {
                s2.await();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            flag = 3;
            s3.signal();
        } finally {
            lock.unlock();
        }
    }

    public void print15() throws InterruptedException {
        lock.lock();
        try {
            while (flag != 3) {
                s3.await();
            }
            for (int i = 0; i < 15; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            flag = 1;
            s1.signal();
        } finally {
            lock.unlock();
        }
    }
}
