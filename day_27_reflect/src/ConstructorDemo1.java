import java.lang.reflect.Constructor;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 17:48
 */
public class ConstructorDemo1 {
    public static void main(String[] args) throws Exception {
        Class aclass = Class.forName("Person");
        //获取公共构造器数组
        /*Constructor[] constructors=aclass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }*/
        //获取所有构造器
        /*Constructor[] constructors = aclass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }*/
        /*//获取无参公有构造器
        Constructor constructor=aclass.getConstructor();
        //由构造器对象创建原类对象
        Object o=constructor.newInstance();
        System.out.println(o);*/
        /*//获取带参公有构造器
        Constructor constructor=aclass.getConstructor(int.class,String.class,String.class);
        Object object=constructor.newInstance(33,"张三","北极");
        System.out.println(object);*/
        //获取私有构造器
        Constructor constructor=aclass.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);
        Object object=constructor.newInstance(13);
        System.out.println(object);
    }
}
