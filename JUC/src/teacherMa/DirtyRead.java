package teacherMa;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/3/2
 * 14:30
 */
public class DirtyRead {
    public int number;
    public static void main(String[] args) {
        DirtyRead dirtyRead = new DirtyRead();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dirtyRead.number = 100;
            }
        }).start();
        System.out.println(dirtyRead.get());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(dirtyRead.get());
    }
    //当业务数据中出现为加锁的读操作时，效率增加，会导致脏读。
    public int get() {
        return this.number;
    }
}
