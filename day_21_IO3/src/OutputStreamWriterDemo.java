import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 23:32
 * 字符流=字节流+代码
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) {
        /*try(OutputStreamWriter osw=new OutputStreamWriter(new
                FileOutputStream("f:\\a.txt"),"UTF-8")){*/
        try(OutputStreamWriter osw=new OutputStreamWriter(new
                FileOutputStream("a.txt"),"UTF-8")){
            osw.write("中国");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
