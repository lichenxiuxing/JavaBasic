/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/7/8
 * 13:18
 */
public class StringTest {
    /*public static void main(String[] args) {
        String s = new String("a") + new String("b");
        String s1 = s.intern();
        System.out.println(s1);
        System.out.println(s1 == "ab");
        System.out.println(s1.equals("ab"));
    }*/


        public static void main(String[] args) {
            String s1 = "Programming";
            String s2 = new String("Programming");
            String s3 = "Program";
            String s4 = "ming";
            String s5 = "Program" + "ming";
            String s6 = s3 + s4;
            System.out.println(s1 == s2);//f
            System.out.println(s1 == s5);//t
            System.out.println(s1 == s6);//f
            System.out.println(s1 == s6.intern());//t
            System.out.println(s2 == s2.intern());//f
        }


}
