/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/4
 * 21:20
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@dad5dc
        //获取扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@16d3586
        //获取引导类加载器
        ClassLoader bootStrapClassLoader = extClassLoader.getParent();
        System.out.println(bootStrapClassLoader);//null 无法获取
        //获取当前类的类加载器,一般类都是由系统类加载器进行加载
        ClassLoader thisClassLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(thisClassLoader);//sun.misc.Launcher$AppClassLoader@dad5dc
        //获取String类的类加载器，核心类都是由引导类加载器进行加载
        ClassLoader stringClassLoader = String.class.getClassLoader();
        System.out.println(stringClassLoader);//null
    }
}
