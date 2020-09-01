package zhouYang;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/7/13
 * 20:51
 */
public class ThreadTest {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        //每一个线程都有自己的ThreadLocalMap，通过这个来完成线程隔离
        //键是ThreadLocal对象
        //由ThreadLocal完成对ThreadLocalMap的存取
    }
}
