/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/21
 * 14:38
 */
public class StringTest {
    public static void main(String[] args) {
        //测试String类的各种构造方法
        byte[] bytes = {95, 93, 96, 92, 97};
        String s = new String(bytes);
        //字节数组被转化为相应的字符，串接生成字符串
        System.out.println(s);
        String s1 = new String(bytes, 2, 1);
        System.out.println(s1);
        //字符数组直接串接生成字符串
        System.out.println("------------");
        char[] chars={'d','c','4','b'};
        String s2=new String(chars);
        System.out.println(s2);
        String s3=new String(chars,1,1);
        System.out.println(s3);
    }
}
