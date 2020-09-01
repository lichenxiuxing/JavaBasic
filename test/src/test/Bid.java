package test;

import java.util.Arrays;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/7/22
 * 20:23
 */
public class Bid {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,4,4,3};
        test(arr);
    }
    public static void test(int[] arr) {
        Arrays.sort(arr);
        int slow = arr.length - 1;
        int fast = arr.length - 2;
        int a = 0;
        int b = 0;
        int flag = 2;
        while (slow >= 0 && fast >= 0 && flag > 0) {
            if (arr[slow] != arr[fast]) {
                fast--;
                slow--;
                continue;
            }
            flag--;
            if (flag == 1) {
                a = arr[fast];
            } else {
                b = arr[fast];
            }
            fast -= 2;
            slow -= 2;
        }
        if (a == 0 || b == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(a * b);
    }
}
