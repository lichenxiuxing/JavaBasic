package StudentDemo2;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/31
 * 23:46
 */
public class SetThread extends Thread {
    Student student;
    private int i=0;
    public SetThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        while (true){
            synchronized (student){
                //通过flag来设置是否已消费完成
                if(student.flag){
                    try {
                        student.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(i%2==0){
                    student.name="张三";
                    student.age=3;
                }else {
                    student.name="李四";
                    student.age=4;
                }
                i++;
                student.flag=true;
                student.notify();
            }
        }

    }
}
