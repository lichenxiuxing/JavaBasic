import java.util.Date;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/22
 * 19:24
 */
public class DataDemo {
    public static void main(String[] args) {
        //Data的两个构造方法
        Date date=new Date();
        System.out.println(date);
        System.out.println("==============");
        long l=System.currentTimeMillis();
        Date date1=new Date(l);
        System.out.println(date1);
    }
}
