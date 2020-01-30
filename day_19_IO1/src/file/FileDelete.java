package file;

import java.io.File;
import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 1:33
 */
public class FileDelete {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.delete());//删除文件
        File file1 = new File("aaa//bbb//ccc");
        System.out.println(file1.mkdirs());
        System.out.println(file1.delete());//当文件夹中包含有文件或文件夹时不能直接删除
        File file2=new File("aaa//bbb");
        System.out.println(file2.delete());
        File file3=new File("aaa");
        System.out.println(file3.delete());
    }
}
