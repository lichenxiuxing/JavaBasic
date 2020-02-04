/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 15:54
 */
public class ThreadStopDemo {
    public static void main(String[] args) {
        ThreadStop threadStop = new ThreadStop();
        threadStop.start();
        try {
            Thread.sleep(3000);
            //stop直接终止线程，而不管是否有后续
            //threadStop.stop();
            //通过调用正在执行的线程的异常来结束进程
            threadStop.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
