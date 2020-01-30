package exception;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 0:42
 */
public class ExtendException {
}
class Fu{
    public void show() throws ArithmeticException{

    }
    public void method(){

    }
}
class Zi extends Fu{
    @Override
    public void show() throws ArithmeticException {
        //子类方法抛出异常时只能抛出父类方法异常的本身或子类
        super.show();
    }

    @Override
    public void method() {
        try {
            super.method();
        } catch (Exception e) {
            //对于父类方法中没有出现的异常，只能由子类方法自身处理，无法抛出
            e.printStackTrace();
        }
    }
}
