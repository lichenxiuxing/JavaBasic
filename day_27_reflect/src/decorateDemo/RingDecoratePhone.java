package decorateDemo;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 23:41
 */
public class RingDecoratePhone extends Decorate{
    public RingDecoratePhone(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        System.out.println("彩铃响了");
        super.call();
    }
}
