/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/18
 * 15:44
 */
public class ExtendsDemo1 {
    public static void main(String[] args) {
        //在加载类时，先加载父类，再加载子类
        Zi zi = new Zi();
    }
}

class Fu {
    static {
        System.out.println("这是静态代码块fu");
    }

    {
        System.out.println("这是成员变量代码块fu");
    }

    public Fu() {
        System.out.println("这是构造函数fu");
    }
}

class Zi extends Fu {
    static {
        System.out.println("这是静态代码块zi");
    }

    {
        System.out.println("这是成员遍历代码块zi");
    }

    public Zi() {
        System.out.println("这是构造函数zi");
    }
}

