package time;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/1
 * 15:11
 * Timer：定时任务
 * TimerTask
 */
public class TimerDemo {
    public static void main(String[] args) {
        Timer timer=new Timer();
        //只执行一次
        timer.schedule(new MyTask(),3000);
        //执行多次
        timer.schedule(new MyTask(),3000,2000);
    }

}
class MyTask extends TimerTask{
    @Override
    public void run() {
        System.out.println("beng,爆炸了");
    }
}
