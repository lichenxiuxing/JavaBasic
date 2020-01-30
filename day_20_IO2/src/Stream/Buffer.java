package Stream;

import java.io.*;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 22:45
 */
public class Buffer {
    public static void main(String[] args) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(
                new FileInputStream("f:\\a.txt")
        ); BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                new FileOutputStream("f:\\c.txt")
        )) {
            byte[] bytes = new byte[1024];
            int i;
            while((i=bufferedInputStream.read(bytes))!=-1){
                bufferedOutputStream.write(bytes,0,i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
