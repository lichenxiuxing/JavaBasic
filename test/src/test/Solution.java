package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/8/14
 * 10:46
 */
public class Solution {
    public static void main(String[] args) {
        String s = ")()(";
        removeInvalidParentheses(s);

    }
    static HashSet<String> set = new HashSet<>();
    public static List<String> removeInvalidParentheses(String s) {
        char[] charArr = s.toCharArray();
        int leftDel = 0;
        int rightDel = 0;
        for (char c : charArr) {
            if (c == '(') {
                leftDel++;
            } else if (c == ')') {
                if (leftDel > 0) {
                    leftDel--;
                } else {
                    rightDel++;
                }
            }
        }
        dfs(charArr, 0, 0, 0, leftDel, rightDel, new StringBuilder());
        ArrayList<String> res = new ArrayList<>();
        res.addAll(set);
        return res;
    }
    public static void dfs(char[] charArr, int index, int leftCount, int rightCount, int leftDel, int rightDel, StringBuilder sb) {
        if (index == charArr.length) {
            if (leftDel == 0 && rightDel == 0) {
                set.add(sb.toString());
            }
            return;
        }
        if (charArr[index] == '(' && leftDel > 0) {
            dfs(charArr, index + 1, leftCount, rightCount, leftDel - 1, rightDel, sb);
        }
        if (charArr[index] == ')' && rightDel > 0) {
            dfs(charArr, index + 1, leftCount, rightCount, leftDel, rightDel - 1, sb);
        }
        sb.append(charArr[index]);
        if (charArr[index] == '(') {
            dfs(charArr, index + 1, leftCount + 1, rightCount, leftDel, rightDel, sb);
        } else if (charArr[index] == ')') {
            if (leftCount > rightCount) {
                dfs(charArr, index + 1, leftCount, rightCount + 1, leftDel, rightDel, sb);
            } else return;
        } else {
            dfs(charArr, index + 1, leftCount, rightCount, leftDel, rightDel, sb);
        }
        sb.deleteCharAt(sb.length() - 1);
    }
}
