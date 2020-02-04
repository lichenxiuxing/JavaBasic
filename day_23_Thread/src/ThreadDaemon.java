/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 15:41
 * 守护线程：当一个程序内都是守护线程时，则程序结束
 *
 */
public class ThreadDaemon {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        MyThread myThread1=new MyThread();
        MyThread myThread2=new MyThread();

        myThread.setName("first");
        myThread1.setName("second");
        myThread2.setName("third");

        myThread.setDaemon(true);
        myThread1.setDaemon(true);
        myThread2.setDaemon(true);

        myThread.start();
        myThread1.start();
        myThread2.start();
        Thread thread=Thread.currentThread();

        for (int i = 0; i <1000 ; i++) {
            System.out.println(thread.getName()+":"+i);
        }
    }
}
