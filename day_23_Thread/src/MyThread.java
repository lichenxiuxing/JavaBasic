/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 14:22
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <200 ; i++) {
            System.out.println(this.getName()+":"+i);
        }
    }
}
