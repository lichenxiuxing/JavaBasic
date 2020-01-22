import java.util.Scanner;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/22
 * 11:57
 */
public class QQTest {
    public static void main(String[] args) {
        System.out.println("请输入QQ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(checkQQ(s));
    }

    public static boolean checkQQ(String s) {
        boolean flag = false;
        if (s.length() >= 5 && s.length() <= 15 && s.startsWith("0")) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (Character.isDigit(chars[i])) {
                    return flag;
                }
            }
            flag = true;
        }
        return flag;
    }
}
