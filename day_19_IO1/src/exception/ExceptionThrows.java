package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/28
 * 23:55
 */
public class ExceptionThrows {
    public static void main(String[] args) {
        try {
            method();//通过try-catch处理,或继续抛出
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public static void method() throws ParseException {
        String s ="2014-04-03";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("" +
                "yyyy-MM-dd");
        simpleDateFormat.parse(s);
    }
}
