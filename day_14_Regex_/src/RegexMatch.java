import java.util.Scanner;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/22
 * 12:29
 * 正则表达式是一串字符串，可用于字符串匹配
 */
public class RegexMatch {
    public static void main(String[] args) {
        System.out.println("请输入您的手机号");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(phoneMatch(s));
    }
    public static boolean phoneMatch(String s){
        String regex="1[38]\\d{9}";
        return s.matches(regex);
    }
}
