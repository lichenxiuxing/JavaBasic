package father;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/20
 * 15:12
 */
public class Son extends Father {
    public static void main(String[] args) {
        //同一包下子类可以访问除private修饰以外的其他方法
        Son son = new Son();
        son.show1();
        son.show2();
        son.show3();
    }
}
