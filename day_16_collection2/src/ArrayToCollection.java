import java.util.Arrays;
import java.util.List;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/23
 * 16:07
 */
public class ArrayToCollection {
    public static void main(String[] args) {
        //通过Arrays.asList方法将数组转为集合
        List<Integer> linkedList= Arrays.asList(1,2,3);
        //由于集合是由数组转化而来，因此改变数组长度的add/remove方法均不可用
        //而get/set方法可用。
        System.out.println(linkedList);
    }
}
