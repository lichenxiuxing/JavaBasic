import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 19:13
 */
public class MethodDemo {
    public static void main(String[] args) throws Exception {
        Class aclass=Class.forName("Person");
        Constructor constructor=aclass.getConstructor();
        Object object=constructor.newInstance();
        //getMethods   getDeclaredMethods同Constructor和Field
        //无参无返回值的方法使用
        /*Method method=aclass.getMethod("method");
        method.invoke(object);*/
        //有参无返回值方法的使用
        /*Method method=aclass.getMethod("method",int.class);
        method.invoke(object,1);*/
        /*//有参有返回值方法的使用
        Method method=aclass.getMethod("test", int.class, int.class);
        //通过Object来接收
        Object i = method.invoke(object, 1, 3);
        System.out.println(i);*/
        //私有方法的使用
        Method method=aclass.getDeclaredMethod("show", String.class);
        method.setAccessible(true);
        method.invoke(object,"张三");
    }
}
