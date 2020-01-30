package recursive;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/29
 * 14:00
 */
public class FeiBoNaQie {
    public static void main(String[] args) {
        System.out.println(feibonaqie(20));
    }
    public static int feibonaqie(int i){
        if(i==1||i==2){
            return 1;
        }else return feibonaqie(i-1)+feibonaqie(i-2);
    }
}
