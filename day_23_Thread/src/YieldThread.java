/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 15:33
 */
public class YieldThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <200 ; i++) {
            Thread.yield();
            //暂停当前线程一下
            System.out.println(this.getName()+":"+i);
        }
    }
}
