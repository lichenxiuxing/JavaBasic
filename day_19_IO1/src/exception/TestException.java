package exception;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 0:31
 */
public class TestException {
    public static void main(String[] args) {
        try {
            method();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
    public static void method() throws MyException{
        throw new MyException("异常测试");//throw用在自定义异常时，因为无法确定异常何时
        //触发，因此，需要手动抛出
    }
}
