import java.util.HashMap;
import java.util.Map;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/26
 * 23:54
 * key:Stuent
 * value:String
 */
public class HashMapDemo1 {
    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<>();
        Student student=new Student(12,"zs");
        Student student1=new Student(13,"ls");
        Student student2=new Student(14,"wu");
        Student student3=new Student(16,"zl");
        Student student4=new Student(15,"zl");
        map.put(student,"1");
        map.put(student,"2");
        map.put(student1,"2");
        map.put(student2,"3");
        map.put(student3,"4");
        map.put(student4,"5");
        for (Student student5 : map.keySet()) {
            System.out.println(student5+"========="+map.get(student5));
        }
    }
}
