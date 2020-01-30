package Stream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 18:13
 */
public class FileOutputStreamDemo1 {
    public static void main(String[] args)  {
        //换行：windows:\n\r
        //追加写入时，在流构造方法中修改append为true
        try (FileOutputStream fileOutputStream=new FileOutputStream("f:\\c.txt",true)){
            for (int i = 0; i <10 ; i++) {
                fileOutputStream.write(("hello"+i+"\r\n").getBytes());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
