package udp;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/2
 * 18:41
 */
public class TalkRoom {
    public static void main(String[] args) {
        ReceiveThread receiveThread=new ReceiveThread();
        SendThread sendThread=new SendThread();
        Thread thread1=new Thread(receiveThread);
        Thread thread2=new Thread(sendThread);
        thread1.start();
        thread2.start();
    }
}
