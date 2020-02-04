package StudentDemo2;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 23:46
 */
public class GetThread extends Thread {
    Student student;

    public GetThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        while (true){
            synchronized (student) {
                if(!student.flag){
                    try {
                        student.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(student.name + "====" + student.age);
                student.flag=false;
                student.notify();
            }
        }

    }
}
