package teacherMa;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/2
 * 14:37
 * 可重入锁:线程中的方法在获取锁之后，还可以继续持有锁。
 */
public class ReinLock {
    public static void main(String[] args) {
        ReinLock reinLock = new ReinLock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                reinLock.m1();
            }
        }).start();
    }

    public synchronized void m1() {
        System.out.println("m1");
        m2();
    }
    public synchronized void m2(){
        System.out.println("m2");
    }
}
