import java.io.File;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/30
 * 18:31
 * 多个文件复制
 */
public class MultiFile {
    public static void main(String[] args) {
        File srcFile = new File("f:\\java");
        File destFile = new File("f:\\test");
        copyDictory(srcFile,destFile);
    }

    private static void copyDictory(File srcFile, File destFile) {
        File[] srcFiles = srcFile.listFiles();
        for (File file : srcFiles) {
            if(file.isDirectory()){
                //是文件夹的情况
                File newFile=new File(destFile,file.getName());
                newFile.mkdir();
                copyDictory(file,newFile);
            }else {
                //是文件的情况
                File newFile=new File(destFile,file.getName());
                SingleFolderCopy.copy(file,newFile);
            }
        }
    }
}
