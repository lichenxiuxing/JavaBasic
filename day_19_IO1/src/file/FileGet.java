package file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 1:54
 */
public class FileGet {
    public static void main(String[] args) {
        File file=new File("f:\\b.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.length());
        System.out.println(file.getName());
        Date data=new Date(file.lastModified());//获取最后一次修改的毫秒值
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(data));
    }
}
