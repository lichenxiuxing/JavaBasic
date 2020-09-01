package lambda;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/7
 * 18:37
 * 方法引用：是lambda表达式的一种简写。
 * 应用场景：lambda表达式的主体仅定义了一个方法，且该表达式仅调用了一个已经存在的方法
 * 特性：方法引用所调用方法的形参和返回值和lambda所实现接口的形参和返回值相同
 *
 */
public class MethodReference {
    public static void main(String[] args) {
        //case1,对象名::非静态方法
        //Consumer void consume(T t)
        //System.out void println(String s)
        System.out.println("lambda表达式");
        Consumer<String> consumer = (s)-> System.out.println(s);
        consumer.accept("Hello");
        System.out.println("方法引用");
        PrintStream ps = System.out;
        Consumer<String> consumer1 = ps::println;
        consumer1.accept("world");
        //case2,类名::非静态方法
        //Comparator<Integer> int compare(int x,int y)
        //Integer             int compare(int x,int y)
        Comparator<Integer> comparable = (x, y)->Integer.compare(x,y);
        System.out.println(comparable.compare(13, 11));
        System.out.println("*****************");
        Comparator<Integer> comparator = Integer::compare;
        System.out.println(comparator.compare(11, 13));
        //case2.1,形参不一致时，此时方法的调用者与形参相同如
        //Comparator<Integer> int compare(int x,int y)
        //Integer             int compareTo(int x)
        Comparator<Integer> comparable1 = (x, y)->Integer.compare(x,y);
        System.out.println(comparable1.compare(13, 11));
        System.out.println("*****************");
        Comparator<Integer> comparator1 = Integer::compareTo;
        System.out.println(comparator1.compare(11, 13));
        //case3,类名::静态方法

    }
}
