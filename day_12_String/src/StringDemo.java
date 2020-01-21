import java.util.Scanner;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/21
 * 15:52
 * 判断一个字符串中大写小写以及数字的个数
 */
public class StringDemo {
    public static void main(String[] args) {
        count();
    }

    public static void count() {
        System.out.println("请输入一段仅包含小写大写以及数字的字符串");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int numCount = 0;
        int smallCount = 0;
        int bigCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                numCount++;
            }
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                smallCount++;
            }
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                bigCount++;
            }
        }
        System.out.printf("大写字母有%d个，小写字母有%d个，数字有%d个",bigCount
        ,smallCount,numCount);
    }

}

