import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/22
 * 19:38
 */
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //date------------String
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("" +
                "yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
        //String ------------date
        String s = "1992-01-02 21:30:28";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1=simpleDateFormat1.parse(s);
        System.out.println(date1);
    }
}
