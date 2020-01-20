package innerClass;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/20
 * 16:20
 * 成员内部类（定义在类的成员部分，与成员变量，成员方法同级）的使用
 */
public class MemberInnerClass {
    public static void main(String[] args) {
        //非静态内部类方法的使用
        Outer.Inner oi=new Outer().new Inner();
        oi.show();
        System.out.println("------------");
        //静态内部类的使用
        Outer1.Inner1 oi1=new Outer1.Inner1();
        oi1.show();
        oi1.show1();
        //静态内部类的静态方法的使用
        Outer1.Inner1.show1();
    }
}

class Outer {
    private int num = 20;
    class Inner{
        private int num1=30;
        public void show(){
            System.out.println(num);//内部类可以直接使用外部类的私有变量
        }
    }
    Inner inner=new Inner();
    //inner.show();可以创建成员内部类的对象，但不能使用其方法
    /*外部类的方法无法使用内部类的私有变量
    public void show1(){
        System.out.println(num1);
    }*/
}
class Outer1 {
    private int num = 20;
    private static int num2=30;
    private static int num3=40;
    //内部类是静态：为了访问数据的方便(内部类还可以设置为私有的，通过同级方法进行
    //验证来使用内部类）
    static class Inner1{
        private int num1=50;
        //静态内部类中的非静态方法
        public void show(){
            //System.out.println(num);无法访问非静态变量
            System.out.println(num2);
        }
        //静态内部类中的静态方法
        public static void show1(){
            System.out.println(num3);
        }
    }
}
