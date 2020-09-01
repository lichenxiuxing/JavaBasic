package zhouYang;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/7
 * 11:46
 * lambda表达式：复制()，写死->，重写{}
 */
public class SaleTicketDemo {
    public static void main(String[] args) {
        Tickets tickets = new Tickets();
        new Thread(() ->
                tickets.sale()
                , "A") {
        }.start();
        new Thread(() ->
                tickets.sale()
                , "B") {
        }.start();
        new Thread(() ->
                tickets.sale()
                , "C") {
        }.start();
    }

}

class Tickets {
    private int tickets = 30;
    Lock lock = new ReentrantLock();

    public void sale() {
        lock.lock();
        try {
            while (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出了" + tickets-- + "张票。");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
