/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/21
 * 14:58
 */
public class String1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        /*System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println((s1+s2).hashCode());*/
        System.out.println(s3==s1+s2);//false 字符串变量当引用看待
        System.out.println(s3=="hello"+"world");//true 字符串字面量当基本数据类型看待
    }
}
