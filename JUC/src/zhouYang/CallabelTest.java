package zhouYang;

import java.util.concurrent.FutureTask;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/8
 * 20:37
 */
public class CallabelTest {
    public static void main(String[] args) {
        //callable的lambda实现

        new Thread(new FutureTask<Integer>(() ->2+8)).start();
        System.out.println();
    }

}
