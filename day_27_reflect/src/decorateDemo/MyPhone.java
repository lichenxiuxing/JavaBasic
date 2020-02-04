package decorateDemo;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 23:35
 */
public class MyPhone implements Phone {
    @Override
    public void call() {
        System.out.println("打电话");
    }
}
