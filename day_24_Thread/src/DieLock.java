/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 23:27
 */
public class DieLock extends Thread {
    private final static Object OBJECTA = new Object();
    private final static Object OBJECTB = new Object();
    private boolean flag;

    public DieLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (OBJECTA) {
                System.out.println("if a");
                synchronized (OBJECTB) {
                    System.out.println("if b");
                }
            }
        } else {
            synchronized (OBJECTB) {
                System.out.println("else b");
                synchronized (OBJECTA) {
                    System.out.println("else a");
                }
            }
        }
    }

}
