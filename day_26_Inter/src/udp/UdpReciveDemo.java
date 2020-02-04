package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/2
 * 18:05
 */
public class UdpReciveDemo {
    public static void main(String[] args) throws IOException {
        //接收端需要确认端口号
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        int len=bytes.length;
        //创建接收包
        DatagramPacket dp=new DatagramPacket(bytes,len);
        //通过套接字来接受数据,把接收到的数据放入dp中。
        ds.receive(dp);
        String s=new String(dp.getData(),0,dp.getLength());
        System.out.println(s);
        InetAddress ia=dp.getAddress();
        System.out.println(ia.getHostAddress()+":"+ia.getHostName());
        ds.close();
    }
}
