package StudentDemo1;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 23:46
 */
public class GetThread extends Thread{
    Student student;

    public GetThread(Student student) {
        this.student = student;
    }
    @Override
    public void run() {
        System.out.println(student.name+"===="+student.age);
    }
}
