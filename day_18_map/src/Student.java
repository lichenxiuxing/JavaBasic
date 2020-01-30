import java.util.Objects;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/26
 * 23:48
 */
public class Student {
    int age;
    String s;

    public Student(int age, String s) {
        this.age = age;
        this.s = s;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", s='" + s + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(s, student.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, s);
    }
}
