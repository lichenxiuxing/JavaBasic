import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/30
 * 16:27
 */
public class ArrayListToFile {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        try(BufferedWriter bufferedWriter=new BufferedWriter
                (new FileWriter("a.txt"))){
            for (String s : arrayList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
