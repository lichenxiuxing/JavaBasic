import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 18:47
 */
public class FieldDemo {
    public static void main(String[] args) throws Exception {
        Class aclass=Class.forName("Person");
        Constructor constructor=aclass.getConstructor();
        Object object=constructor.newInstance();
        //获取所有公共属性
        //Field[] fields=aclass.getFields();
        //获取所有属性
        //Field[] fields=aclass.getDeclaredFields();
        //获取并设置单个公共属性
        Field field=aclass.getField("age");
        field.set(object,22);
        //获取并设置单个默认属性
        Field addressField=aclass.getDeclaredField("address");
       addressField.set(object,"北京");
        //获取并设置单个私有属性
        Field nameAddress=aclass.getDeclaredField("name");
        nameAddress.setAccessible(true);
        nameAddress.set(object,"王二");
        System.out.println(object);
    }
}
