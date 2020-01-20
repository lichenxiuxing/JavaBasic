/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/19
 * 13:48
 * 抽象类的特点
 */
public class AbstractTest {
    public static void main(String[] args) {
        //测试抽象类的使用
        Animal animal=new Cat(13);//创建有参对象
        //抽象类通过多态来完成对象的使用
        animal.eat();
        //通过子类完成对父类方法的调用
        animal.show();
    }
}
abstract class Animal{
    private int age;
    //抽象类可以有抽象方法，但不能创建抽象类对象，其作用是帮助子类完成初始化
    public Animal(){}
    public Animal(int age){
        this.age=age;
    }
    //类中有抽象方法，则此类必为抽象类。此抽象方法是强制子类必须做的事
    public abstract void eat();
    //抽象类中可以有非抽象方法，此方法设计为用来被子类继承的，提高代码复用率
    public void show(){
        System.out.println("show animal");
    }
    public final void finalTest(){
        System.out.println("test final");
    }
    public final void finalTest(int a){
        //final修饰的方法不可被重写，但可以被重载
    }
    //private abstract void abstractTest();抽象方法不能被私有修饰
    //public static abstract void staticTest();抽象方法不能被静态修饰
}
class Cat extends Animal{
    public Cat(){
        //无参构造方法，自动调用父类无参构造方法。super()
    }
    public Cat(int age){
        super(age);
    }
    @Override
    public void eat() {
        System.out.println("cat eat");
    }
}
