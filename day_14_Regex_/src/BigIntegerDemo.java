import java.math.BigInteger;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/22
 * 19:07
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger i=new BigInteger("100");
        BigInteger i1=new BigInteger("50");
        System.out.println(i.add(i1));
        System.out.println(i.divide(i1));
        System.out.println(i.multiply(i1));
        System.out.println(i.subtract(i1));
        //BigDecimal用于对浮点数的计算
    }
}
