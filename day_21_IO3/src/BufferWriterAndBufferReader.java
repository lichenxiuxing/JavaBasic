import java.io.*;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/30
 * 0:16
 */
public class BufferWriterAndBufferReader {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader=new BufferedReader(new
                FileReader("f:\\a.txt")); BufferedWriter bufferedWriter=
                new BufferedWriter(new FileWriter("f:\\c.txt"))){
            int i;
            while ((i=bufferedReader.read())!=-1){
                bufferedWriter.write(i);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
