package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/2
 * 17:51
 */
public class UdpSendDemo {
    public static void main(String[] args) throws IOException {
        byte[] bytes="hello world".getBytes();
        int len=bytes.length;
        InetAddress ia= InetAddress.getByName("192.168.0.107");
        int port =10086;
        //创建套接字
        try(DatagramSocket ds=new DatagramSocket()){
            //将数据、ip地址、端口号打包
            DatagramPacket dp=new DatagramPacket(bytes,len,ia,port);
            ds.send(dp);
        }
    }
}
