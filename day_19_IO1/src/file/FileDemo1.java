package file;

import java.io.File;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 2:07
 * 得到所有以.txt结尾的文件
 */
public class FileDemo1 {
    public static void main(String[] args) {
        File file = new File("c:\\");
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                if(file1.getName().endsWith(".txt")){
                    System.out.println(file1.getName());
                }
            }
        }
    }

}
