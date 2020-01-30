package file;

import java.io.File;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 2:00
 */
public class FileGetAdvanced {
    public static void main(String[] args) {
        File file = new File("H:\\basic");
        String[] strings = file.list();//返回该文件下的所有文件和文件夹的字符串形式
        for (String string : strings) {
            System.out.println(string);
        }
        File[] files=file.listFiles();//返回该文件下的所有文件和文件夹的File对象
        for (File file1 : files) {
            System.out.println(file1.getName());
        }
    }
}
