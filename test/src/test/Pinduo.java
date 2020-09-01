package test;

import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/8/2
 * 19:03
 */
public class Pinduo {
    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int alen = Integer.valueOf(str.split(" ")[0]);
        int blen = Integer.valueOf(str.split(" ")[1]);
        int deli = Integer.valueOf(str.split(" ")[2]);
        int[][] arr = new int[alen][2];
        int[][] brr = new int[blen][2];
        for (int i = 0; i < arr.length; i++) {
            str = br.readLine();
            arr[i][0] = Integer.valueOf(str.split(" ")[0]);
            arr[i][1] = Integer.valueOf(str.split(" ")[1]);
        }
        for (int i = 0; i < brr.length; i++) {
            str = br.readLine();
            brr[i][0] = Integer.valueOf(str.split(" ")[0]);
            brr[i][1] = Integer.valueOf(str.split(" ")[1]);
        }
        eat(arr,brr,deli);*/
        int[] arr = new int[]{6,6,6,6};
        test(arr, 1);
    }
    public static void test(int[] arr, int len) {
        int sum = 0;
        int back = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > len) {
                int step = sum - len;
                if (step > len) {
                    len = step;
                    sum = 0;
                } else {
                    sum = len - step;
                }
                back++;
            } else if (sum < len) {
                continue;
            } else {
                System.out.println("paradox");
                return;
            }
        }
        System.out.println((len - sum) + " " + back);
    }
    public static void eat(int[][] arr, int[][] brr, int deli) {
        if (deli == 0) {
            System.out.println(0);
            return;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] >= deli) {
                res = Math.min(arr[i][0], res);
            }
        }
        for (int i = 0; i < brr.length; i++) {
            if (brr[i][1] >= deli) {
                res = Math.min(brr[i][0], res);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                if (arr[i][1] + brr[j][1] >= deli) {
                    res = Math.min(arr[i][0] + brr[j][0], res);
                }
            }
        }
        if (res == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(res);
        }
    }
}
