import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/30
 * 21:58
 */
public class PropertiesDemo3 {
    public static void main(String[] args) {
        myLoad();
        myStore();
    }

    private static void myLoad() {
        //file--------properties
        //File存储格式必须是键值对
        Properties properties=new Properties();
        try(FileReader fileReader=new FileReader("a.txt")){
            properties.load(fileReader);
            System.out.println(properties);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void myStore() {
        Properties properties=new Properties();
        properties.setProperty("张三", "30");
        properties.setProperty("李四", "40");
        properties.setProperty("王五", "50");
        try(FileWriter fileWriter=new FileWriter("b.txt")){
            properties.store(fileWriter,"this is a test");//第二个参数是
            //描述信息
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
