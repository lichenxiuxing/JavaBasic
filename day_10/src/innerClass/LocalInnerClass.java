package innerClass;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/20
 * 17:27
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Out out = new Out();
        out.method();
    }
}

class Out {
    private int a = 1;

    //局部内部类：被定义在方法的内部
    //1可以访问外部类的变量
    //2可以在方法内新建内部对象，使用内部成员方法
    //3在定义内部类成员变量时，需要将其设置为final类型
    public void method() {
        class In {
            int b = 2;//jdk8以后默认设置为final类型

            public void show() {
                System.out.println(a);
            }

            public void show1() {
                System.out.println(b);
            }
        }
        In in = new In();
        in.show();
        in.show1();
    }


}
