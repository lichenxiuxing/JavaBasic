package exception;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 0:30
 */
public class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);//自定义异常需要提供有参构造方法
    }
}
