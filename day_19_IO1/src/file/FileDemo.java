package file;

import java.io.File;
import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 1:15
 * 文件和目录必须分别通过file对象创建
 */
public class FileDemo {
    public static void main(String[] args) {
        File file=new File("f:\\java");
        //File对象只是一个对本地路径的指示，并不一定实体存在
        System.out.println(file.mkdir());//创建文件夹，每次只创建一个，创建成功则返回true;
        File file1=new File("f:\\java1\\java");
        System.out.println(file1.mkdirs());//创建多个文件夹，成功返回true
        File file2 =new File("f:\\java\\a.txt");
        try {
            System.out.println(file2.createNewFile());//创建文件，会抛出异常
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
