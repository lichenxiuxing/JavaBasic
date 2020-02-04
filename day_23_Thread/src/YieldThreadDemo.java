/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 15:34
 */
public class YieldThreadDemo {
    public static void main(String[] args) {
        YieldThread myThread=new YieldThread();
        YieldThread myThread1=new YieldThread();
        YieldThread myThread2=new YieldThread();

        myThread.setName("first");
        myThread1.setName("second");
        myThread2.setName("third");
        //会有效果，但也并非一定是有序礼让执行
        myThread.start();
        myThread1.start();
        myThread2.start();
    }
}
