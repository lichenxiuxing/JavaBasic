package StudentDemo1;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 23:46
 */
public class SetThread extends Thread {
    Student student;

    public SetThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        student.name="张三";
        student.age=19;
    }
}
