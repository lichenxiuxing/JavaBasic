import java.lang.reflect.Field;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 20:20
 */
public class Tool {
    public static void setProperty(Object object,String methodName,Object arg) throws NoSuchFieldException, IllegalAccessException {
        Class aclass=object.getClass();
        Field field=aclass.getDeclaredField(methodName);
        field.setAccessible(true);
        field.set(object,arg);
    }
}
