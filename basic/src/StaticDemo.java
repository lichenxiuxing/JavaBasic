/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/18
 * 14:39
 * 测试静态代码块，构造代码块和构造方法的执行顺序
 */
public class StaticDemo {
    static {
        System.out.println("这是主方法的静态代码块");
    }
    public static void main(String[] args) {
        System.out.println("这是Demo的主方法");
        StaticTest staticTest1 = new StaticTest();
        StaticTest staticTest2 = new StaticTest();
    }
}

class StaticTest {
    static {
        System.out.println("这是静态代码块，只执行一次");
    }
    //成员变量代码块的作用：将构造方法共有的部分提取到代码块中，在每次执行构造方法
    //时都会事先调用成员变量代码块
    {
        System.out.println("这是成员变量代码块，每次创建对象都会执行");
    }

    public StaticTest() {
        System.out.println("这是构造方法，在成员变量代码块执行后执行");
    }
}
