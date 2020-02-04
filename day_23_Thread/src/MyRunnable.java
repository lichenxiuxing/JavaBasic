/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 16:38
 */
public class MyRunnable implements Runnable {
    //此方法的优点：1、可以解决java单继承的问题
    //2、在处理数据时，可以是处理同一对象的数据，而不是新建两个对象
    //做到了数据共享。比如如下，此时两个线程都可以对a进行操作
    public int a;//
    @Override
    public void run() {
        a++;
        for (int i = 0; i <200 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
