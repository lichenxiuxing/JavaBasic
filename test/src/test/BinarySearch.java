package test;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/7/25
 * 12:00
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] {9, 7, 6, 4, 3, 1, 0, 2, 3, 4, 9};
        int res = search(arr);
        System.out.println(res);
        double a = Math.pow(6,2);
    }
    public static int search(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + right >> 1;
            if (arr[mid] < arr[left] && arr[mid] < arr[right]) {
                left++;
            } else if (arr[mid] < arr[left] && arr[mid] > arr[right]) {
                left = mid + 1;
            } else if (arr[mid] > arr[left] && arr[mid] < arr[right]) {
                right = mid - 1;
            }
        }
        return arr[left];
    }
}
