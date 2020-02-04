package StudentDemo3;

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
            if(i%2==0){
                student.set("zhangsan",3);
            }else {
                student.set("lisi",4);
            }
            i++;
        }

    }
}
