package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/7/21
 * 21:03
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int num = 0;
        List<int[]> list1 = new LinkedList<>();
        List<int[]> list2 = new LinkedList<>();
        if ((str = scanner.readLine()) != null) {
            num = Integer.parseInt(str);
        }
        int len = num;
        num--;
        int k = 0;
        while ((str = scanner.readLine()) != null) {
            if (num == 0) {
                k = Integer.parseInt(str);
                break;
            }
            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);
            list1.add(new int[]{a,b});
        }
        while ((str = scanner.readLine()) != null) {
            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);
            list2.add(new int[]{a,b});
        }
        int[][] arr = new int[len + 1][len + 1];
        for (int i = 0; i < list1.size(); i++) {
            int[] temp = list1.get(i);
            arr[temp[0]][temp[1]] = 1;
        }
        backTrack(arr, list2);
        int[] res = new int[k];
        System.out.println(Arrays.toString(res));
    }
    public static void backTrack(int[][] arr, List<int[]> list2) {

    }
}
