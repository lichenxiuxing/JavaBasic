/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 15:31
 */
public class ThreadSleep extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <200 ; i++) {
            System.out.println(this.getName()+":"+i);
            try {
                //sleep是静态方法
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
