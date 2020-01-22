/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/21
 * 22:36
 * StringBuffer默认容量是16
 */
public class StringBufferConstract {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());
        System.out.println("====================");
        StringBuffer stringBuffer1=new StringBuffer(24);
        System.out.println(stringBuffer1.capacity());
        System.out.println(stringBuffer1.length());
        System.out.println("====================");
        StringBuffer stringBuffer2=new StringBuffer("StringBuffer");
        System.out.println(stringBuffer2.capacity());
        System.out.println(stringBuffer2.length());
        System.out.println("====================");
    }
}
