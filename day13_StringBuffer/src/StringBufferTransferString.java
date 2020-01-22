/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/21
 * 23:18
 */
public class StringBufferTransferString {
    public static void main(String[] args) {
        // String ------ StringBuffer
        String s = "hello";
        //方法1，构造方法
        StringBuffer stringBuffer = new StringBuffer(s);
        //方法2，append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(s);
        //String-------StringBuffer
        //方法1，构造方法
        String s1 = new String(stringBuffer);
        //方法2，任意对象的toString方法都可以转化为字符串
        String s2 = stringBuffer.toString();
    }
}
