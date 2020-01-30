import java.util.HashMap;
import java.util.Map;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/26
 * key:String
 * value:Student
 * 23:47
 */

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();
        Student student=new Student(12,"zs");
        Student student1=new Student(13,"ls");
        Student student2=new Student(14,"wu");
        Student student3=new Student(15,"zl");
        Student student4=new Student(15,"zl");

        map.put("1",student);
        map.put("2",student1);
        map.put("3",student2);
        map.put("4",student3);
        map.put("5",student4);

        for (String s : map.keySet()) {
            System.out.println(s+"====="+map.get(s));
        }
    }

}
