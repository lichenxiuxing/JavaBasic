package design_model.singleModel;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/1
 * 16:38
 */
public class Demo {
    public static void main(String[] args) {
        Student student1=Student.getStudent();
        Student student2=Student.getStudent();
        System.out.println(student1==student2);//结果为true,证明内存中只有一个对象
    }
}
