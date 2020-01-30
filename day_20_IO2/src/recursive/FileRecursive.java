package recursive;

import java.io.File;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 13:44
 */
public class FileRecursive {
    public static void main(String[] args) {
        File file = new File("f:\\");
        findTxt(file);
    }

    public static void findTxt(File file) {
        File[] files = file.listFiles();
        if (files != null)
            for (File file1 : files) {
                if (file1.isFile()) {
                    if (file1.getName().endsWith(".txt")) {
                        System.out.println(file1.getName());
                    }
                } else if (file1.isDirectory()) {
                    findTxt(file1);
                }
            }
    }
}

