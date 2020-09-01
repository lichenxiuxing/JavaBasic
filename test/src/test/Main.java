package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/7/22
 * 19:53
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /*int m = Integer.valueOf(str.split(" ")[0]);
        int n = Integer.valueOf(str.split(" ")[1]);
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            str = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.valueOf(str.split(" ")[j]);
            }
        }
        System.out.println(getMax(arr));*/
        int m = Integer.valueOf(str.split(" ")[0]);
        char[][] ints = new char[m][3];
        for (int i = 0; i < m; i++) {
            str = br.readLine();
            for (int j = 0; j < 3; j++) {
                ints[i][j] = str.split(" ")[j].toCharArray()[0];
            }
        }
        count(ints);
        System.out.println(res);
    }
    public static long getMax(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int top = 1;
        int button = m - 1;
        int left = 1;
        int right = n - 1;
        long res = 0;
        for (int i = top; i < button; i++) {
            for (int j = left; j < right; j++) {
                res = Math.max(res, get(arr, i, j));
            }
        }
        return res;
    }
    public static long get(int[][] arr, int i, int j) {
        return arr[i - 1][j] + arr[i][j] + arr[i + 1][j] + arr[i][j - 1] + arr[i][j + 1];
    }
    public static int res = 0;
    public static char[][] ints;
    public static void count(char[][] arr) {
        ints = arr;
        int[] track = new int[3];
        backTrack(0, track, 0);
    }
    public static void backTrack(int k, int[] track, int start) {
        if (k == 3) {
            if (judge(track)) {
                res++;
            } return;
        }
        for (int i = start; i < ints.length; i++) {
            add(track, ints[i]);
            backTrack(k + 1, track, i + 1);
            delete(track, ints[i]);
        }
    }
    public static boolean judge(int[] track) {
        if ((track[0] == track[1] && track[1] == track[2]) ||
        (track[0] != track[1] && track[1] != track[2] && track[2] != track[0])) {
            return true;
        } else {
            return false;
        }
    }
    public static void add(int[] track, char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A') {
                track[0]++;
            } else if (arr[i] == 'B') {
                track[1]++;
            } else {
                track[2]++;
            }
        }
    }
    public static void delete(int[] track, char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A') {
                track[0]--;
            } else if (arr[i] == 'B') {
                track[1]--;
            } else {
                track[2]--;
            }
        }
    }
}



