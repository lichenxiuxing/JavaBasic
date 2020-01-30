import java.io.*;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/30
 * 17:16
 * 复制.java文件并将后缀改为.jad
 */
public class ChangeHouzui {
    public static void main(String[] args) {
        File srcFile = new File("f:\\test");
        File destFile = new File("f:\\test1");
        if (!destFile.exists()) {
            destFile.mkdirs();
        }
        File[] files = srcFile.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return (new File(dir, name).isFile()) && name.endsWith(".java");
            }
        });
        for (File file : files) {
            File oldFile = new File(destFile, file.getName());
            copy(file, oldFile);
        }
        File[] newFiles = destFile.listFiles();
        for (File newFile : newFiles) {
            File tempFile=new File(destFile,newFile.getName().replace(".java",".jad"));
            newFile.renameTo(tempFile);
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
            while ((i = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
