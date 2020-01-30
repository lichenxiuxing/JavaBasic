import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/30
 * 16:34
 */
public class FileToArraylist {
    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>();
        try(BufferedReader bufferedReader=new BufferedReader(
                new FileReader("a.txt")
        )){
            String s;
            while((s=bufferedReader.readLine())!=null){
                strings.add(s);
            }
            for (String string : strings) {
                System.out.println(string);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
