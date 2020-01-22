/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/22
 * 18:57
 * 计算程序运行的时间
 */
public class SystemCurrent {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
