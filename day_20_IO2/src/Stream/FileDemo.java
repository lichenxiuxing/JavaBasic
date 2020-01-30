package Stream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 21:07
 */
public class FileDemo {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream=new FileInputStream("f:\\c.txt"))
        {
            //为解决每次都只读取一个字节问题，通过数组进行读取
            byte[] bytes=new byte[1024];//一般选择1024或其倍数
            int i;
            //int read(byte[] bytes),返回的是读入数组的元素个数
            while ((i=fileInputStream.read(bytes))!=-1){
                System.out.print(new String(bytes,0,i));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
