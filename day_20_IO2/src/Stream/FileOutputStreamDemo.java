package Stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 17:53
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        //新建一个文件输出流：
        //FileOutputStream fileOutputStream = new FileOutputStream("f:\\.txt");
        File file=new File("f:\\a.txt");
        //自动创建文件时，文件当前目录必须存在
        //自动释放流资源
        try(FileOutputStream fileOutputStream = new FileOutputStream(file);) {
            byte[] bytes="hello java".getBytes();
            fileOutputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
