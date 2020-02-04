import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 22:41
 */
public class SellTickets implements Runnable {
    private int tickets = 100;
    private Lock lock= new ReentrantLock();
    @Override
    public void run() {
        while (true){
            //可以防止锁没有释放
            try{
                lock.lock();
                if(tickets>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"" +
                            "正在售卖第"+(tickets--)+"张票。");
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
