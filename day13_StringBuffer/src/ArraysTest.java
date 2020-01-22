import java.util.Arrays;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/22
 * 0:34
 * 数组的工具类
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] arrays={1,5,3,7,4};
        //toString
        System.out.println(Arrays.toString(arrays));
        //sort
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
        //binarySearch
        System.out.println(Arrays.binarySearch(arrays, 7));
    }
}
