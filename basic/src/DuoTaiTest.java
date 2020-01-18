/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/19
 * 0:34
 */
public class DuoTaiTest {
    public static void main(String[] args) {
        FU fu=new ZI();
        //显示父类的变量，子类变量无法通过编译
        System.out.println(fu.num);
        //无法访问num2,因为父类中无此参数System.out.println(fu.num2);
        //下列方法调用时，调用子类重写的方法
        fu.show();
        //无法使用子类方法，因为父类中无此方法fu.method()，无法通过编译;
    }
}
class FU{
    int num=100;
    public void show(){
        System.out.println("fu");
    }
}
class ZI extends FU{
    int num=1000;
    int num2=200;
    public void show(){
        System.out.println("zi");
    }
    public void method(){
        System.out.println("zi method");
    }
}
