/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/21
 * 23:07
 */
public class StringBufferDelete {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("helloworld");
        stringBuffer.deleteCharAt(3);
        System.out.println(stringBuffer);
        System.out.println("------------------");
        stringBuffer.delete(0,stringBuffer.length());
        System.out.println(stringBuffer);
    }
}
