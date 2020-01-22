/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/22
 * 17:17
 */
public class RegexSplit {
    public static void main(String[] args) {
        String s = "aa,bb,cc";
        String [] strings=s.split(",");
        for (int i = 0; i <strings.length ; i++) {
            System.out.println(strings[i]);
        }
        System.out.println("==================");
        String s1 = "aa.b.cc";
        String [] strings1=s1.split("\\.");//在正则表达式中.代表任意字符，
        //因此需要加转义字符
        for (int i = 0; i <strings1.length ; i++) {
            System.out.println(strings1[i]);
        }
        System.out.println("==================");
        String s2 = "aa   bb  cc";
        String [] strings2=s2.split(" +");
        for (int i = 0; i <strings2.length ; i++) {
            System.out.println(strings2[i]);
        }
        System.out.println("==================");

        String s3 = "H:\\资料\\jdk api 1.8_China.zip";
        String [] strings3=s3.split("\\\\ ");
        for (int i = 0; i <strings3.length ; i++) {
            System.out.println(strings3[i]);
        }
    }
}
