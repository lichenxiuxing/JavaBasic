import java.math.BigInteger;
import java.nio.channels.NonWritableChannelException;
import java.rmi.Naming;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * @Copyright LiChen
 * 用户：biyang
 * 创建时间：2020/1/13
 * 14:25
 */
class Basic {
    public static void main(String[] args) {
        //各个进制的转换体现
        System.out.println(100);
        System.out.println(0b100);
        System.out.println(0100);
        System.out.println(0x100);
        //各个基本数据类型的默认转换
        char a = 'a';
        short b = 1;
        //short char boolean之间不能相互转换，需要先变为int再进行计算
        //int会变为long,long会变为float，float会变为double
        int c = a + b;
        long d = 1;
        int e = 3;
        long f = d + e;
        float g = 1.1f;
        float h = d + g;

    }
}

class Test {
    public static void main(String[] args) {
        byte b1 = 3, b2 = 4, b;
        //byte之间计算也是将其转换为int，再进行存储
        //b=b1+b2;
        b = (byte) (b1 + b2);
        System.out.println(b);
        long a = 1;
        long c = 2;
        System.out.println(a / c * 1.0);
        System.out.println(a * 1.0 / c);
        boolean j = false;
    }
}

class swapint {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        //整型变量的交换，任何一个整数异或同一个整数偶数次等于它本省
        b = a ^ b;//b=a^b
        a = b ^ a;//a=a^b^a  等于  b
        b = b ^ a;//b=a^b^b  等于  a
        System.out.println(a);
        System.out.println(b);
        //方法2
        a = a + b;
        b = a - b;
        a = a - b;
        //方法3
        b = (a + b) - (a = b);
    }
}

class shuixianhua {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 10 / 10 % 10;
            if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i) {
                System.out.println(i);
            }

        }
        System.out.println(Math.pow(3, 3.1));
    }
}

class string {
    public static void main(String[] args) {
        String s = new String("string");
        String s1 = s;
        System.out.println(s == s1);
        System.out.println(s.equals(s1));
        String s2 = new String("string");
        System.out.println("-----------");
        System.out.println(s == s2);
        System.out.println(s.equals(s2));
    }
}

class control {
    public static void main(String[] args) {
        int i = 1;
        int j = 3;
        BigInteger c = BigInteger.valueOf(i).add(BigInteger.valueOf(j));
        System.out.println(c);

    }
}

class reload {
    //方法重载,与返回值无关，虚拟机通过方法签名（函数名，输入参数）来确认
    public static void main(String[] args) {
        System.out.println(sum(1, 3));
    }

    public static int sum(int a, int b) {
        System.out.println("两数相加");
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        System.out.println("三数相加");
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        System.out.println("四数相加");
        return a + b + c + d;
    }
}

class arrayDemo {
    public static void main(String[] args) {
        //测试空指针异常
        int[] array = new int[3];
        array = null;//将引用指向空
        System.out.println(array[0]);//指向空指针,将出现空指针异常
    }
}

class reverse {
    public static void main(String[] args) {
        //数组逆序
        int[] array = {1, 3, 5, 6, 7};
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[arr.length - i - 1] ^ arr[i];
            arr[arr.length - i - 1] = arr[arr.length - i - 1] ^ arr[i];
            arr[i] = arr[arr.length - i - 1] ^ arr[i];
        }
    }
}

class trancle {
    public static void main(String[] args) {
        //杨辉三角
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        yangHuiSanJioa(scanner.nextInt());
    }

    public static void yangHuiSanJioa(int n) {
        int[][] arr = new int[n][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}

class arrayTest {
    public static void main(String[] args) {
        //数组引用的测试
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        swap(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void swap(int [] a,int [] b){
        //交换引用后对原先数组并无影响
        int[] temp=a;
        a=b;
        b=temp;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
class Static{
    //测试static的使用
    public static void main(String[] args) {
        People people1=new People();
        People.age=11;//可以通过类名设置
        people1.age=13;//可以通过对象名设置，而且一次设置对所有对象均适用
        System.out.println(people1.age);

    }

}
class People{
    static int age;
    String name;
    public void show(){
        age=11;//非静态方法可以调用静态变量
        name="zhangsna";
    }
    public static void print(){
        age=13;
        //name="lisi";//静态方法不是调用静态变量，因为静态方法和静态变量随着类的加载而加载，而非成员变量
        //依赖于对象的建立，此时，还没有对象存在。
        //因此，成员变量和成员方法时是使用于类的，而不是对象。
    }
}
class TestData{
    public static void main(String[] args) {
        System.out.println(new Date().toString());
    }
}