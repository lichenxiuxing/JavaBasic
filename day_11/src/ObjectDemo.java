/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/20
 * 20:22
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        //不同对象的哈希值是不同的，哈希值是由地址值经过算法生成的一个整数
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        //public final Class getClass()
        System.out.println("---------");
        System.out.println(student.getClass().getName());
        System.out.println("---------");
        //toString方法，一般需要重写
        //未重写
        System.out.println(student.toString());
        //重写
        System.out.println(new OverrideStudent().toString());
        System.out.println("---------");
        //equals方法，一般需重写
        //未重写
        System.out.println(student.equals(student1));
        //重写
        OverrideStudent overrideStudent = new OverrideStudent();
        OverrideStudent overrideStudent1 = new OverrideStudent();
        System.out.println(overrideStudent.equals(overrideStudent1));
    }
}
