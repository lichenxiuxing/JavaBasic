package zhouYang;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/7/14
 * 17:07
 */
public class Single2 {
    private Single2(){};
    private static class LazyHolder {
        private static Single2 instance = new Single2();
    }
    public static Single2 getInstance() {
        return LazyHolder.instance;
    }
}
