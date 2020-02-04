/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 21:22
 * 产生线程安全问题的原因：1、多线程；2、共享数据；3、多条语句操作共享数据
 * 通过synchronized来解决，将操作数据的多条语句用一把锁进行封锁
 * <p>
 * 同步代码锁的对象：
 * *********任意对象
 * 同步方法锁的对象
 * *********this对象
 * 同步静态方法锁的对象
 * *********类的class对象
 */
public class TicketDemo implements Runnable {
    private static int tickets = 100;
    private int i = 0;
    private Object object = new Object();

    @Override
    public void run() {
        while (true) {
            //只有三个线程共有一把锁，才有锁住的可能
            if (i % 2 == 0) {
                //synchronized (object) {
                //synchronized (this) {
                synchronized (TicketDemo.class) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "" +
                                "正在售出第" + (tickets--) + "张票。");
                    }
                }
            }else {
                //method();
                staticMethod();
            }
        }
    }

    private synchronized void method() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "" +
                    "正在售出第" + (tickets--) + "张票。");
        }
    }

    private synchronized static void staticMethod() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "" +
                    "正在售出第" + (tickets--) + "张票。");
        }
    }
}
