package StudentDemo2;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 23:46
 * 通过加锁解决了线程安全问题，凡是涉及到共享数据的程序都需要加同一把锁
 * 通过锁对象的notify和wait方法实现轮流执行线程,完成生产消费模式
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        SetThread setThread = new SetThread(student);
        GetThread getThread = new GetThread(student);
        setThread.start();
        getThread.start();
    }
}
