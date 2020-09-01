package zhouYang;


import java.util.Random;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/10
 * 17:48
 */
public class Test {
    public static void main(String[] args) {
        //获取线程数
        System.out.println(Runtime.getRuntime().availableProcessors());
        //虚拟机试图使用的最大总量（默认为内存的1/4）
        long max = Runtime.getRuntime().maxMemory();
        System.out.println(max/1024/1024);
        //jvm初始内存
        long total = Runtime.getRuntime().totalMemory();
        System.out.println(total/1024/1024);
        //生成oom
        String string = "hello world";
        while (true) {
            string += string + new Random().nextInt(1000000)+new Random().nextInt(20000000);

        }
        //byte[] b = new byte[40*1024*1024];



    }
}
