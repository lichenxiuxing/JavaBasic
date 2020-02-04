import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 20:01
 * 通过反射越过泛型检查
 */
public class GenericDemo {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> arrayList = new ArrayList<>();
        Class aclass = arrayList.getClass();
        //泛型中源码是object类型
        Method method=aclass.getMethod("add",Object.class);
        method.invoke(arrayList,"hello");
        method.invoke(arrayList,"world");
        method.invoke(arrayList,"java");
        System.out.println(arrayList);
    }
}
