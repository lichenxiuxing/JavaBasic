/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/18
 * 15:23
 */
class ExtendsDemo {
    public static void main(String[] args) {
        //调用子类的构造方法之前，都会调用父类的无参数构造方法
        //在子类的每一个构造方法之前，都会有一个默认的super();
        /*Son son=new Son();
        Son son1=new Son(1);*/

    }
}

class Father {
    private int age;

    public Father() {
        System.out.println("这是父类的无参数构造方法");
    }

    public Father(int age) {
        this.age = age;
        System.out.println("这是父类的有参数构造方法");
    }
}
class Son extends Father{
    private int age;
    public Son(){
        super();
        System.out.println("这是子类的无参数构造方法");
    }
    public Son(int age){
        super();
        this.age=age;
        System.out.println("这是子类的有参数构造方法");
    }
}
class Mother{
    //父类不提供无参数构造方法
    public Mother(String s){
        System.out.println("父类的有参数构造方法");
    }
}
class Daughter extends Mother{
    public Daughter(){
        //在子类构造方法中显示调用父类的有参数构造方法，即可完成对父类成员
        //变量的初始化
        super("name");
        System.out.println("这是子类的无参数构造方法");
    }
    public Daughter(String name){
        //也可以不使用super，但需要依赖同属于子类的构造方法
        //完成对父类成员变量的初始化即可
        this();
        System.out.println("这是子类的有参数构造方法");
    }
}