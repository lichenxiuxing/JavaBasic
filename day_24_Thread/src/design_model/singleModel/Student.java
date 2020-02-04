package design_model.singleModel;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/1
 * 16:38
 * 饿汉式：类一加载就创建对象
 */
public class Student {
    //单例模式：内存中只能有一个对象存在
    //构造方法要私有
    private Student() {
    }

    //提供成员变量和成员方法，以供创建对象
    //因为外界无法通过对象调用，所以变量和方法都要设计为static
    //防止外界对对象的方法访问，将其设为私有
    private static Student student = new Student();
    public static Student getStudent(){
        return student;
    }

}
