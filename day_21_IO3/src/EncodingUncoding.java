import java.util.Arrays;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 23:20
 */
public class EncodingUncoding {
    public static void main(String[] args) throws Exception {
        String s="你好";
        /*byte[] bytes=s.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes));//[-28, -67, -96, -27, -91, -67]
        System.out.println(new String(bytes,"UTF-8"));*/
        /*byte[] bytes=s.getBytes();//idea解码方式是utf-8
        System.out.println(Arrays.toString(bytes));//[-28, -67, -96, -27, -91, -67]
        System.out.println(new String(bytes));*/
        //gbk是两个字节表示一个汉字，utf-8是三个字节
        byte[] bytes=s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));//[-60, -29, -70, -61]
        System.out.println(new String(bytes,"GBK"));
    }
}
