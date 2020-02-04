/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 14:38
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //测试不同线程下的静态变量是否通用:通用，即子类对父类的静态变量是通用的
        MyThread myThread=new MyThread();
        /*MyThread1 myThread1=new MyThread1();
        myThread.start();
        myThread1.start();*/
        MyThread myThread1=new MyThread();
        //重写线程名
        myThread.setName("线程first");
        myThread1.setName("线程second");
        myThread.start();
        myThread1.start();
        //获取当前运行的非Thread子类的线程
        Thread thread=Thread.currentThread();
        thread.setName("主线程");
        System.out.println(thread.getName());

    }
}
