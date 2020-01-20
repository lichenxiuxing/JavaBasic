/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/20
 * 15:11
 * 测试权限修饰符
 * 想要被所有使用时，用public修饰
 * 想要在包中使用时，使用默认
 * 只想被子类使用时，使用protected
 * 只在本类中使用时，使用private
 */
package father;

public class Father {
    public static void main(String[] args) {
        //同一类中可以访问所有权限修饰符下的方法
        Father father = new Father();
        father.show();
        father.show1();
        father.show2();
        father.show3();
    }

    private void show() {
        System.out.println("show private");
    }

    void show1() {
        System.out.println("show default");
    }

    protected void show2() {
        System.out.println("show protected");
    }

    public void show3() {
        System.out.println("show public");
    }
}
