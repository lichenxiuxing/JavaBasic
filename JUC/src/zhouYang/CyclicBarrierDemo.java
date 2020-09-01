package zhouYang;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/11
 * 0:17
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        //类比于CountDownLatch,这个是做加法
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3,() -> {
            System.out.println("线程结束");//多线程都完成后执行此任务。
        });
        for (int i = 0; i < 3 ; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(finalI);
                    try {
                        cyclicBarrier.await();//在线程都执行完之后释放
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }

            },String.valueOf(i)).start();
        }
    }
}
