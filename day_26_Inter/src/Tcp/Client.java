package Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/2
 * 19:03
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.107",12306);
        //socket提供了包，来装载和发送数据，无需手动send
        //发送数据
        OutputStream os=socket.getOutputStream();
        os.write("hello world".getBytes());

        //接收数据
        InputStream is=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int l=is.read(bytes);
        String s=new String(bytes,0,l);
        System.out.println(s);
        socket.close();
    }
}
