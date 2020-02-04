import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/2
 * 16:38
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress=InetAddress.getByName("192.168.0.107");
        String name=inetAddress.getHostName();
        String address=inetAddress.getHostAddress();
        System.out.println(name);
        System.out.println(address);
    }
}
