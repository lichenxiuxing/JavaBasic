package Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/2
 * 19:06
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(12306);
        //收发数据都依靠socket完成,socket依靠io流
        Socket socket=serverSocket.accept();
        //接收数据
        InputStream is=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int l=is.read(bytes);
        String s=new String(bytes,0,l);
        System.out.println(s);
        //写出数据
        OutputStream os=socket.getOutputStream();
        os.write("数据已收到".getBytes());
        socket.close();
    }
}
