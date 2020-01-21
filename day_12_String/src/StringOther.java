/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/21
 * 16:33
 */
public class StringOther {
    public static void main(String[] args) {
        String s = "helloWorld";
        String s1 = s.replace('l', 'o');
        String s2 = s.replace("el", "ak47");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("=============");
        String s3="abbb";
        String s4="xllj";
        System.out.println(s.compareTo(s3));//从首字母开始比较
        System.out.println(s.compareTo(s4));
    }
}
