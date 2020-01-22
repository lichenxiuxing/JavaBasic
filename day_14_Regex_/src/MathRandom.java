/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/22
 * 18:33
 */
public class MathRandom {
    public static void main(String[] args) {
        //获取一个区间内的随机数
        System.out.println(mathRandom(3,10));
    }

    public static int mathRandom(int start, int end) {
        return (int)(Math.random() * end + start);
    }
}
