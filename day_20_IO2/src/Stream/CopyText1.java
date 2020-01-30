package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 21:21
 */
public class CopyText1 {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream=new FileInputStream("f" +
                ":\\a.txt"); FileOutputStream fileOutputStream=new FileOutputStream(
                        "f:\\c.txt"
        )){
            byte [] bytes=new byte[1024];
            int i;
            while ((i=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
