package decorateDemo;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 23:36
 */
public abstract class Decorate implements Phone{
    private Phone phone;
    public Decorate(Phone phone){
        this.phone=phone;
    }

    @Override
    public void call() {
        this.phone.call();
    }
}
