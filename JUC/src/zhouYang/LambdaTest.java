package zhouYang;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/7
 * 15:25
 */
public class LambdaTest {
    public static void main(String[] args) {
        //如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值。
        //写死（），加上 -> 落地{}
        Foo foo = () -> 2;
        System.out.println(foo.mul(3,4));
        System.out.println(Foo.div(4,1));
        System.out.println(foo.foo());
    }
}

//函数式接口只能有一个方法声明，通过注解@FunctionalInterface来限制
@FunctionalInterface
interface Foo {
    int foo();

    default int mul(int x, int y) {
        return x * y;
    }
    default void nothing() {};

    //java8以后接口可以写静态方法的实现，通过类名调用，不可以被重写
    static int div(int x, int y) {
        return x / y;
    }
}
