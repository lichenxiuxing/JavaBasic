package StudentDemo1;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 23:46
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
