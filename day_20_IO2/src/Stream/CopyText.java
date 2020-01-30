package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 20:47
 * 完成对文件的复制
 * 文件到文件的转换不会有乱码问题，因为采用同样的编解码方式
 */
public class CopyText {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream=new FileInputStream("f" +
                ":\\a.txt"); FileOutputStream fileOutputStream=
                new FileOutputStream("f:\\b.txt")){
            int by;
            while ((by=fileInputStream.read())!=0){
                fileOutputStream.write(by);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
