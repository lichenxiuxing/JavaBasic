/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 14:22
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        /*myThread1.run();
        调用run方法等于直接调用，没有开启线程
        myThread2.run();*/
        /*myThread1.start();
        IllegalThreadStateException
        start：1、开启线程；2、执行run方法
        一个对象只能开启一个线程
        myThread1.start();*/
        myThread1.start();
        myThread2.start();
    }
}
