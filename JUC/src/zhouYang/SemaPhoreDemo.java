package zhouYang;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/11
 * 0:34
 */
public class SemaPhoreDemo {
    public static void main(String[] args) {
        //用于多并发资源的互斥控制
        //多对多资源争抢
        Semaphore semaphore = new Semaphore(3);//三个资源六个线程争抢
        for (int i = 0; i < 6; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();//抢占资源
                        System.out.println(Thread.currentThread().getName()+"\t抢到了车位。");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println(Thread.currentThread().getName()+"\t释放了车位");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        semaphore.release();//释放资源
                    }
                }
            },String.valueOf(i)).start();
        }
    }
}
