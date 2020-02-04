package reflectDemo;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 19:37
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Properties properties=new Properties();
        FileReader fileReader=new FileReader("H:\\javaDir\\javaBasic\\day_27_reflect\\src\\reflectDemo\\class.txt");
        properties.load(fileReader);
        String className=properties.getProperty("className");
        String classMethod=properties.getProperty("classMethod");
        Class aclass=Class.forName(className);
        Constructor constructor=aclass.getConstructor();
        Object object=constructor.newInstance();
        Method method=aclass.getDeclaredMethod(classMethod);
        method.invoke(object);
    }
}
