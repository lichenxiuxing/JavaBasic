package design_model.singleModel;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/1
 * 16:48
 * 懒汉式：1：延迟加载
 * *******2:线程安全问题
 */
public class Teacher {
    private Teacher(){}
    private static Teacher teacher=null;
    public synchronized static Teacher getTeacher(){
        //可能出现线程安全问题
        if(teacher==null){
            teacher=new Teacher();
        }
        return teacher;
    }
}
