package interfaceUse;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/20
 * 18:55
 */
public interface Test {
    default void test(){
        //接口中的方法可以用default来修饰，这样方便对接口的扩展
        //即在扩展接口时，原先实现了该接口的类无需重新定义此方法也仍能继续使用
        System.out.println("this is a default test");
    }
    void show();
}
