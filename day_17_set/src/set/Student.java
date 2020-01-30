package set;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/24
 * 1:36
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //重写方法完成自然排序

    @Override
    public int compareTo(Student o) {
        //先按名字排序，由小到大
        int num=this.age-o.age;
        //在按照名字
        int num2=num==0?(this.name.compareTo(o.name)):(num);
        return num2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
