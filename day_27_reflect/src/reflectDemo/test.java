package reflectDemo;

import java.lang.reflect.Constructor;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 19:53
 */
public class test {
    public static void main (String[] args) throws Exception{
        Class aclass = Class.forName("reflectDemo.Student");
        //获取公共构造器数组
        Constructor[] constructors=aclass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }

}
