import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/27
 * 0:30
 */
public class PracticeDemo {
    public static void main(String[] args) {
        System.out.println("请输入一串字母");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new TreeMap<>();
        for (char aChar : chars) {
            Integer i = map.get(aChar);
            if (i == null) {
                map.put(aChar, 1);
            } else {
                i++;
                map.put(aChar, i);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Character character : map.keySet()) {
            stringBuffer.append(character).append("(").append(map.get(character
            )).append(")");
        }
        System.out.println(stringBuffer.toString());
    }
}
