import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/27
 * 0:10
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Student, String> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.age - o2.age;
                int num2 = num == 0 ? o1.s.compareTo(o2.s) : num;
                return num2;
            }
        });
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

