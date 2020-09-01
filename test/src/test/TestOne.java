package test;

import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/7/31
 * 14:01
 */
public class TestOne {
    public int[] coins = new int[] {1,5, 10,50,100};
    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{5,2,2,3,5};
        int count = 55;
        coin(arr, count);
    }
    public static void coin(int[] arr, int count) {
        int res = 0;
        int index = 4;
        while (arr[index] != 0 && count > 0) {
            count -= arr[index];
            res++;
            if (arr[index] == 0) {
                index--;
                if (index < 0) break;
            }
        }
        if (count == 0) {
            System.out.println(res);
        } else {
            System.out.println(-1);
        }
    }





    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            //show(arr);
            return;
        }
        int p = partition(arr, left, right);
        quickSort(arr, left, p - 1);
        quickSort(arr,p + 1, right);
        return;
    }
    public static int partition(int[] arr, int left, int right) {
        int index = left;
        while (left < right) {
            while (left < right && arr[right] >= arr[index]) {
                right--;
            }
            while (left < right && arr[left] <= arr[index]) {
                left++;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        int temp = arr[index];
        arr[index] = arr[left];
        arr[left] = temp;
        show(arr);
        return left;
    }
    public static void show(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            if (i != arr.length - 1) {
                sb.append(arr[i] + " ");
            } else {
                sb.append(arr[i]);
            }
        }
        System.out.println(sb.toString());
    }
    public static void getInt(String str) {
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int foo = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '-') {
                foo = -1;
            }
            if (Character.isDigit(arr[i])) {
                sb.append(arr[i]);
            }
        }
        System.out.println(Integer.parseInt(sb.toString()) * foo);
    }
    public static void judge(int[] arr1, int[] arr2) {
        int[] a1 = new int[2];
        int[] a2 = new int[2];
        int[] b1 = new int[2];
        int[] b2 = new int[2];
        a1[0] = arr1[0];
        a1[1] = arr1[2];
        a2[0] = arr1[1];
        a2[1] = arr1[3];
        b1[0] = arr2[0];
        b1[1] = arr2[2];
        b2[0] = arr2[1];
        b2[1] = arr2[3];

        if (merge(a1, b1) && merge(a2, b2)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    public static boolean merge (int[] arr1, int[] arr2) {
        int max = arr1[1] - arr1[0] + arr2[1] - arr2[0];
        int sum = Math.max(Math.abs(arr1[0] - arr2[1]), Math.abs(arr1[1] - arr2[0]));

        //此时相交
        return max > sum;
    }
}
