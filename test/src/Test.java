import java.util.ArrayList;
import java.util.List;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/26
 * 14:47
 */
public class Test {
    public static void main(String[] args) {
        /*Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));//遇到算术运算自动拆装箱
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));//equals不处理类型转换*/
        String s = new String("1");//会创建两个对象，一个在堆，一个在常量池；返回的是堆里的对象
        s.intern();
        String s1 = "1";
        System.out.println(s == s1);//false

        String s2 = new String("1") + new String("2");//创建的对象不放入常量池中。
        s2.intern();//常量池中存放的是s2的引用；
        String s3 = "12";
        System.out.println(s2 == s3);//1.6 是false; 1.7是true;
        List<Integer> list = new ArrayList<>();
    }

}



