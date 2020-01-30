package set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/24
 * 1:42
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //treeSet是一种按照特定顺序将元素存储的集合
        //方法1、自然排序，需要存储的元素实现comparable接口，并重新compareTo方法
        Set<Student> students = new TreeSet<>();
        students.add(new Student("zhangsan",11));
        students.add(new Student("hangsan",14));
        students.add(new Student("zhangsan",14));
        students.add(new Student("angsan",12));
        students.add(new Student("angsan",11));
        for (Student student : students) {
            System.out.println(student);
        }
        //方法2,构造器排序,无需元素中的对象提供比较方法，而是由集合提供
        Set<Dog> dogs=new TreeSet<>(new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                int num=o1.getAge()-o2.getAge();
                //在按照名字,字符串本身重写了compareTo方法
                int num2=num==0?(o1.getName().compareTo(o2.getName())):(num);
                return num2;
            }
        });
        dogs.add(new Dog("zahng",11));
        dogs.add(new Dog("ahng",12));
        dogs.add(new Dog("hng",14));
        dogs.add(new Dog("ahng",11));
        dogs.add(new Dog("ng",15));
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
