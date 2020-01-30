package exception;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/28
 * 23:13
 * 接口：throwable
 * 子类：error exception
 * exception:runtimeException
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        method();
        method1();
        method2();
    }

    public static void method() {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
            //如果不经try处理，那么异常会导致其后的程序无法执行
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        int[] c = {1, 3, 5};
        try {
            System.out.println(c[3]);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("over");
    }

    public static void method1() {
        int a = 10;
        int b = 0;
        int[] c = {1, 3, 5};
        try {
            System.out.println(a / b);
            System.out.println(c[3]);
            //可以用一个try多个catch，但try中的异常之后的语句不再执行
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("over");
    }
    public static void method2() {
        int a = 10;
        int b = 0;
        int[] c = {1, 3, 5};
        try {
            System.out.println(a / b);
            System.out.println(c[3]);
            //父类catch可以在子类之后，无法在子类之前
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("over");
    }
}
