/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/19
 * 14:52
 */
public interface InterTest {
    //接口中的成员变量都是默认被public static final修饰
    int num=13;
    //因为接口中的变量都已经被初始化完毕，因此不需要构造方法，所以
    //接口中无构造方法
    //接口中的方法默认全部被public abstract所修饰,没有方法体
    void show();
}
