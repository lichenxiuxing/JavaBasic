import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/22
 * 19:52
 */
public class MyYear {
    public static void main(String[] args) throws ParseException {
        //计算自己的出生日
        System.out.println("请输入您的生日");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("" +
                "yyyy-MM-dd");
        long myTime=simpleDateFormat.parse(s).getTime();
        long nowTime=System.currentTimeMillis();
        long time=(nowTime-myTime)/1000/60/60/24;
        System.out.println("您已经出生"+time+"天");
    }
}
