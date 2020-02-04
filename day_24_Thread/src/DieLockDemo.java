/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 23:27
 */
public class DieLockDemo {
    public static void main(String[] args) {
        DieLock dieLock1 = new DieLock(true);
        DieLock dieLock2 = new DieLock(false);
        dieLock1.start();
        dieLock2.start();
    }
}
