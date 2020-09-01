package day_01;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/1
 * 21:10
 * 读写锁：可以并发的读
 */
public class ReadWriteLockDemo {
    public static void main(String[] args) {
        ReadWriteLockTest test = new ReadWriteLockTest();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    //读1000次
                    test.getNum();
                }
            }
        },"read").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test.setNum(10);
            }
        },"write").start();
    }
}

class ReadWriteLockTest {
    public int num;
    public ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    public void getNum() {
        //readWriteLock.readLock()返回一个lock对象
        readWriteLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " : " + this.num);
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public void setNum(int num) {
        readWriteLock.writeLock().lock();
        try {
            this.num = num;
            System.out.println(Thread.currentThread().getName());
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }
}
