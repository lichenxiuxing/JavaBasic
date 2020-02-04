/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 22:44
 */
public class SellTicketsDemo {
    public static void main(String[] args) {
        SellTickets sellTickets=new SellTickets();
        Thread thread=new Thread(sellTickets,"窗口1");
        Thread thread1=new Thread(sellTickets,"窗口2");
        Thread thread2=new Thread(sellTickets,"窗口3");
        thread.start();
        thread1.start();
        thread2.start();
    }
}
