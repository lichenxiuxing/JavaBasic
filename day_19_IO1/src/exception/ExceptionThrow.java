package exception;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 0:07
 */
public class ExceptionThrow {
    public static void main(String[] args) {
        //method();
        method1();
    }

    private static void method1() throws ArithmeticException {
        int a=10;
        int b=0;
        System.out.println(a/b);
    }

    public static void method(){
        int a=10;
        int b=0;
        if(b==0){
            throw new ArithmeticException();
        }else {
            System.out.println(a/b);
        }
    }
}
