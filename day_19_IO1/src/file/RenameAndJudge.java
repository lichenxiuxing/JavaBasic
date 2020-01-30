package file;

import java.io.File;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 1:45
 */
public class RenameAndJudge {
    public static void main(String[] args) {
        File file = new File("f:\\java\\a.txt");
        File file1=new File("f:\\b.txt");
        file.renameTo(file1);//重命名，当文件不存在时，则是剪贴

        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
    }
}
