package file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 2:15
 */
public class FileDemo2 {
    public static void main(String[] args) {
        File file = new File("c:\\");
        String [] strings=file.list(new FilenameFilter() {
            @Override
            //通过文件过滤器实现返回以.txt结尾的文件
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
