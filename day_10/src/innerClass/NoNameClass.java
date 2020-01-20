package innerClass;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/20
 * 18:00
 */
abstract class NoName{
    public abstract void show();
}
public class NoNameClass {
    public static void main(String[] args) {
        method();
        NoNameClass noNameClass=new NoNameClass();
        //通过匿名类来返回对象再使用对象中的方法
        noNameClass.method1().show();

    }
    public static void method(){
        //匿名内部类本质是类的子类或接口的实现类的对象
        new NoName(){
            @Override
            public void show() {
                System.out.println("show");
            }
        }.show();//本质是对象，是一个语句，所有结束时加;
    }

    public NoName method1(){
        //由于本身是对象，所以还可以通过接口或者父类接受，即多态
        //这样用法省去了新建子类或创建接口实现类，在仅仅使用一次时，十分方便
        NoName noName=new NoName() {
            @Override
            public void show() {
                System.out.println("show1");
            }
        };
        return noName;
    }
}
