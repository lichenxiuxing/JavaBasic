/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 15:56
 */
public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(1,3,3,2,5,3));
    }

    public static int sum(int... num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }
}

