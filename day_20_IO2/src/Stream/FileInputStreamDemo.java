package Stream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 20:26
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream=new FileInputStream("f:\\a.txt")){
            int b;
            while((b=fileInputStream.read())!=-1){
                System.out.print((char) b);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
