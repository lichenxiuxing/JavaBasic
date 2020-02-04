package thread_pool;

import java.util.concurrent.Callable;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/1
 * 13:01
 */
public class MyCallable implements Callable<Integer> {
    private int start;
    private int end;
    public MyCallable(int start,int end){
        this.start=start;
        this.end=end;
    }
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = start; i <=end ; i++) {
             sum+=i;
        }
        return sum;
    }
}
