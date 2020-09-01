package day_01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/1
 * 19:39
 */
public class CallableDemo {
    public static void main(String[] args) {
        ThreadDemo3 threadDemo3 = new ThreadDemo3();
        //用FutrueTask来接收返回的数据，此类实现了Runnable接口
        FutureTask futureTask = new FutureTask(threadDemo3);
        new Thread(futureTask).start();
        try {
            //get操作只有在线程执行完毕后才会执行，因此也可用于闭锁。
            int i = (Integer)futureTask.get();
            System.out.println(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

class ThreadDemo3 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (int j = 0; j < 100; j++) {
            i = i + j;
        }
        return i;
    }
}
