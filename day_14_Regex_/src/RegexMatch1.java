import java.util.Scanner;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/22
 * 17:06
 */
public class RegexMatch1 {
    public static void main(String[] args) {
        //任意符号的使用//w
        System.out.println("请输入您的邮箱");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(mailMatch(s));
    }

    public static boolean mailMatch(String s) {
        String regex = "\\w+@\\w{2,5}\\.(\\w{2,3})+";
        return s.matches(regex);
    }
}
