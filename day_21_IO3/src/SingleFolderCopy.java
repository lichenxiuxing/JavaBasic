import java.io.*;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/30
 * 16:49
 * 将一个文件夹下的所有文件复制到另一个文件夹
 */
public class SingleFolderCopy {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("f:\\java");
        File destFile = new File("f:\\test");
        if (!destFile.exists()) {
            destFile.mkdir();
        }
        File[] files = srcFile.listFiles();
        for (File file : files) {
            //将源目录下的文件复制到新目录下
            File newFile = new File("f:\\test\\" + file.getName());
            newFile.createNewFile();
            copy(file, newFile);
        }
    }

    public static void copy(File oldFile, File newFile) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(
                new FileInputStream(oldFile));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                     new FileOutputStream(newFile)
             )
        ) {
            byte[] bytes = new byte[1024];
            int i;
            while ((i=bufferedInputStream.read(bytes))!=-1){
                bufferedOutputStream.write(bytes,0,i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
