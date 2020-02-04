/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 17:17
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取class对象的三种方式
        //方式1
        Person person = new Person();
        Class c1 = person.getClass();
        //方式2
        Class c2 = Person.class;
        //方式3
        Class c3=Class.forName("Person");
        System.out.println(c1==c2);
        System.out.println(c1==c3);
        //所有的数据类型都有class对象
        Integer i=new Integer(1);
        Class aclass1=int.class;
        Class aclass2=i.getClass();
        System.out.println(aclass1==aclass2);
    }
}
