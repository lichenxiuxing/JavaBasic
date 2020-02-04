/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 15:52
 */
public class ThreadStop extends Thread {
    @Override
    public void run() {
        System.out.println("线程开始执行");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("线程由于异常而终止");
        }
        System.out.println("线程结束");
    }
}
