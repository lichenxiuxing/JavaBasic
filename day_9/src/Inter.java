/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/19
 * 14:50
 */
public class Inter {
    public static void main(String[] args) {
        //通过接口实现多态
        InterTest interTest = new InterImpl();
        interTest.show();
        //接口中变量无法被重新赋值
        System.out.println(interTest.num);
        //interTest.num=10;会被报错
    }
}

class InterImpl implements InterTest {
    @Override
    public void show() {
        System.out.println("show interface");
    }
}
abstract class InterImpl1 implements InterTest{
    //抽象类可以实现接口，且无需重写方法，因为接口中的方法是abstract所修饰的
}