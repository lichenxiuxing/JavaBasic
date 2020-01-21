/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/21
 * 15:42
 */
public class StringSearch {
    public static void main(String[] args) {
        String s="helloworld";
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf('h'));
        System.out.println(s.indexOf("llo"));
        System.out.println(s.indexOf('o',5));
        System.out.println(s.indexOf("ro",1));
        System.out.println(s.substring(1));
        System.out.println(s.substring(4,s.length()));
        //遍历字符串
        for (int i = 0; i <s.length() ; i++) {
            System.out.println(s.charAt(i));
        }
    }
}
