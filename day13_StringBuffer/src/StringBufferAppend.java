/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/21
 * 22:57
 * public StringBuffer append(可以是任意类型)
 */
public class StringBufferAppend {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("StringBuffer");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.capacity());
        System.out.println("===============");
        //因为返回值是对象，还可以通过链式编程来添加
        stringBuffer.append("hello").append("world");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.capacity());
        System.out.println("===============");
        StringBuffer stringBuffer1 = new StringBuffer("hello");
        stringBuffer1.insert(3,"hello");
        System.out.println(stringBuffer1);
        System.out.println(stringBuffer.capacity());
        System.out.println("===============");
    }
}
