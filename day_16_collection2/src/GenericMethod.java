/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 13:51
 */
public class GenericMethod {
    public static void main(String[] args) {
        GenericDemo1<String> genericDemo1=new GenericDemo1();
        genericDemo1.show("string");

        System.out.println("=================");
        GenericDemo2 genericDemo2=new GenericDemo2();
        genericDemo2.show(100);
        genericDemo2.show("String");
    }
}
class GenericDemo1 <T> {
    //泛型类中的方法
    public void show(T t){
        System.out.println(t);
    }
}
class GenericDemo2{
    //普通类中的泛型方法
    public <T> void show(T t){
        System.out.println(t);
    }
}
