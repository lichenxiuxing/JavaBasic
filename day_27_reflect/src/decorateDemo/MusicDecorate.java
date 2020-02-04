package decorateDemo;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 23:44
 */
public class MusicDecorate extends Decorate {
    public MusicDecorate(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("音乐响了");
    }
}
