package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/2
 * 18:32
 */
public class SendDemo {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s;
        while (true) {
            try(DatagramSocket ds=new DatagramSocket()){
                s=scanner.nextLine();
                if(s.equals("886")){
                    break;
                }
                byte[] bytes=s.getBytes();
                int len=bytes.length;
                InetAddress ia= InetAddress.getByName("192.168.0.107");
                int port =10086;
                DatagramPacket dp=new DatagramPacket(bytes,len,ia,port);
                ds.send(dp);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
