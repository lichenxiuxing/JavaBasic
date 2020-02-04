/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 14:37
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <200 ; i++) {
            System.out.println(this.getName()+":"+i);
        }
    }
}
