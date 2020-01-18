/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/1/18
 * 12:52
 * 数组工具类的实现
 */
public class ArrayTool {
    //构造方法私有是为了外界只能使用类方法来调用
    private ArrayTool() {
    }

    /**
     *返回数组的遍历
     * @param arr 用于遍历的数组
     */
    public static void arrayList(int[] arr) {
        //用于遍历数组,
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    /**
     *
     * @param arr 用于遍历的数组
     * @return int 数组中的最大值
     */
    public static int maxNumber(int[] arr){
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
