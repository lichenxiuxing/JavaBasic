/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 21:24
 */
public class TicketTest {
    public static void main(String[] args) {
        Runnable runnable=new TicketDemo();
        Thread thread=new Thread(runnable,"窗口1");
        Thread thread1=new Thread(runnable,"窗口2");
        Thread thread2=new Thread(runnable,"窗口3");
        thread.start();
        thread1.start();
        thread2.start();
    }
}
