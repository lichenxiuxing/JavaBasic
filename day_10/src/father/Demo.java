package father;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/20
 * 15:48
 * 权限修饰符：public 默认 protected private
 * 状态修饰符：static final
 * abstract
 */
//私有和保护修饰符不能修饰类
//（对于外部类而言）不可被static修饰，可以被final修饰，即类不能被继承,可被abstract修饰
public class Demo {
    //成员变量，不可被abstract修饰
    public int a;
    int b;
    protected int c;
    private int d;
    final int e = 1;
    static int f = 3;
    String h;

    //abstract int g;
    //构造方法能被public/private/默认/修饰
    public Demo() {
    }

    private Demo(int a) {
        this.a = a;
    }

    Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    protected Demo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /*public final Demo(String s){
        构造方法不能被final修饰
    }*/
    /*public static Demo(String s){
        构造方法不能被static修饰
    }*/
   /* public abstract Demo(String s) {
        构造方法不能被abstract修饰
    }*/
   //普通方法
    public void test(){}
    void test1(){}
    protected void test2(){}
    private void test3(){}
    final void test4(){}
    static void test5(){}
    //abstract void test6(){}可以被abstract修饰，但要求类是abstract的。
}
