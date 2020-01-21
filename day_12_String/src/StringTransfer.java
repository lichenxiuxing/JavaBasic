/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/21
 * 16:23
 */
public class StringTransfer {
    public static void main(String[] args) {
        String s = "helloWorld";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("------------");
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("-----------------");
        int a = 100;
        String s1 = String.valueOf(a);
        System.out.println(s1);
        String s2=String.valueOf(chars);
        System.out.println(s2);
    }
}
