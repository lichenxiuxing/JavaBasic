package backage;

import java.util.Scanner;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/8/26
 * 16:09
 */
public class Back0_1 {
    //15
    //5 3 4 6
    //20 10 12 30

    //62
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int knapsackCapacity = Integer.parseInt(input.nextLine().trim());

        String[] volumesStr = input.nextLine().split(" ");
        int[] volumes = new int[volumesStr.length];
        for (int i = 0; i < volumesStr.length; i++) {
            volumes[i] = Integer.parseInt(volumesStr[i].trim());
        }

        String[] valuesStr = input.nextLine().split(" ");
        int[] values = new int[valuesStr.length];
        for (int i = 0; i < valuesStr.length; i++) {
            values[i] = Integer.parseInt(valuesStr[i].trim());
        }

        if (volumes.length == values.length) {
            //
            System.out.println(getMaxOne(knapsackCapacity, volumes, values));
        } else {
            System.out.println("道具数量不一致。");
        }
        input.close();
    }

    public static int getMax(int n, int[] weights, int[] values) {
        int[][] dp = new int[weights.length + 1][n + 1];
        for (int i = 1; i <= weights.length; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= weights[i - 1]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[weights.length][n];
    }

    public static int getMaxOne(int n, int[] weights, int[] values) {
        int[] dp = new int[n + 1];
        for (int i = 0; i < weights.length; i++) {
            for (int j = n; j >= 0; j--) {
                if (j >= weights[i]) {
                    dp[j] = Math.max(dp[j], dp[j - weights[i]] + values[i]);
                }
            }
        }
        return dp[n];
    }
}
