/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/1
 * 13:12
 */
public class NiMingThread {
    public static void main(String[] args) {
        //继承Thread类
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        }.start();
        //实现Runnable接口
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        }){}.start();
        //两个都实现，以子类继承实现的为准
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println("hello"+":"+i);
                }
            }
        }){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println("world"+":"+i);
                }
            }
        }.start();
    }
}
