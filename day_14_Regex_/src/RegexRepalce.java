/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/22
 * 18:02
 */
public class RegexRepalce {
    public static void main(String[] args) {
        String s="123adfdc 34";
        String regex="\\d";
        String replace="*";
        System.out.println(s.replaceAll(regex,replace));
    }
}
