package day_01;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/1
 * 17:53
 * volatile是轻量级的锁，只保证可见性，不能保证互斥性。禁止指令重排
 * 当只有一个线程在执行写操作时，可以用volatile代替synchronized
 * 原子性并不能保证线程安全
 * 可见性也不能，因为可能存在同时读取，同时修改的情况，此时，数据的修改并未提交到
 * 主存中，因此发生多线程问题。
 */
public class VolatileTest {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        Thread thread = new Thread(td);
        thread.start();
        while (true) {
            if (td.flag) {
                System.out.println("==============");
                break;
            }
        }
    }
}
class ThreadDemo implements Runnable{
    public volatile boolean flag = false;
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println(flag);
    }
}
