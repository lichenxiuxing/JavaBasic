/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 20:24
 */
public class ToolDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //为任意类的任意属性设置值
        People people=new People();
        Tool.setProperty(people,"age",13);
        Tool.setProperty(people,"name","张三");
        System.out.println(people);
    }
}
class People{
    private int age;
    public String name;

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
