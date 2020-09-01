package zhouYang;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/7/14
 * 16:48
 */
public class Singleton {
    private volatile static Singleton instance;
    private Singleton(){
        System.out.println("这是一个单例模式");
    };
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Singleton.getInstance();
            },String.valueOf(i)).start();
        }
    }
}
