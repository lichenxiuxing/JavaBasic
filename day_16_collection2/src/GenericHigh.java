import java.util.ArrayList;
import java.util.Collection;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 15:36
 */
public class GenericHigh {
    public static void main(String[] args) {
        //?代替任意类型
        Collection<?> collection=new ArrayList<Animal>();
        Collection<?> collection1=new ArrayList<Object>();
        Collection<?> collection2=new ArrayList<Dog>();
        Collection<?> collection3=new ArrayList<Cat>();
        // ? extends 向下转型
        //Collection<?extends Animal> collection4=new ArrayList<Object>();
        Collection<?extends Animal> collection5=new ArrayList<Animal>();
        Collection<?extends Animal> collection6=new ArrayList<Dog>();
        Collection<?extends Animal> collection7=new ArrayList<Cat>();
        //? super 向上转型
        Collection<?super Animal> collection8=new ArrayList<Animal>();
        Collection<?super Animal> collection9=new ArrayList<Object>();
        //Collection<?super Animal> collection10=new ArrayList<Dog>();
        //Collection<?super Animal> collection11=new ArrayList<Cat>();

    }
}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
