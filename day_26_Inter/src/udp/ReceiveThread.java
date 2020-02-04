package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/2
 * 18:43
 */
public class ReceiveThread implements Runnable{
    @Override
    public void run() {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(10086);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        byte[] bytes = new byte[1024];
        int len = bytes.length;
        DatagramPacket dp = new DatagramPacket(bytes, len);
        while (true) {
            try {
                ds.receive(dp);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String s = new String(dp.getData(), 0, dp.getLength());
            System.out.println(s);
            InetAddress ia = dp.getAddress();
            System.out.println(ia.getHostAddress() + ":" + ia.getHostName());
        }
    }
}
