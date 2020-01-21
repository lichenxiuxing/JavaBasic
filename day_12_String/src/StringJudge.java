/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/21
 * 15:20
 */
public class StringJudge {
    public static void main(String[] args) {
        String s1 = "helloworld";
        String s2 = "helloworld";
        String s3 = "HelloWorld";
        String s4="";
        System.out.println(s1.endsWith("ld"));
        System.out.println(s1.startsWith("hel"));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s4.isEmpty());
    }
}
