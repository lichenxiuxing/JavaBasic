import java.io.*;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 23:59
 */
public class FileReaderAndFileWriter {
    public static void main(String[] args) {
        //FileReader extends OutputStreamReader
        //FileWriter extends InputStreamWriter
        //当使用本地编码时，可使用上述两种来代替
        try(FileReader fileReader=new FileReader("f:\\a.txt");
            FileWriter fileWriter=new FileWriter("f:\\c.txt")){
            int i;
            while ((i=fileReader.read())!=0){
                fileWriter.write(i);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
