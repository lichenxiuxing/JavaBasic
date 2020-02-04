package decorateDemo;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 23:45
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone phone=new MyPhone();
        phone.call();
        System.out.println("=========");
        Decorate decorate=new MusicDecorate(phone);
        decorate.call();
        System.out.println("==========");
        decorate=new RingDecoratePhone(phone);
        decorate.call();
        System.out.println("===========");
        decorate=new RingDecoratePhone(new MusicDecorate(phone));
        decorate.call();
    }
}
