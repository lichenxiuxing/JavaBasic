/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/5
 * 11:56
 * Run->Edit Configurations -Xxs1m来设置栈的大小
 */
public class StackOverflowErrorTest {
    public static int i = 1;

    public static void main(String[] args) {
        System.out.println(i);
        i++;
        main(args);
        //java.lang.StackOverflowError
    }
}
