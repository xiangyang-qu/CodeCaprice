package per.qxy.backtrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/*
 * @program: CodeCaprice
 * @description: leetCode 77
 * @author: quxiangyang
 * @create: 2022-10-10
 **/
public class Combinations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<List<Integer>> combine = combine(n, k);
        combine.forEach(item ->
        {
            for (Integer integer : item) {
                System.out.print(integer);
                System.out.print(" ");
            }
            System.out.println();
        });
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<Integer> path = new Stack<>();
        backtracking(n, k, 1, result, path);
        return result;
    }

    public static void backtracking(int n, int k, int startIndex, List<List<Integer>> result, Stack<Integer> path) {
        // 中止条件 从 n 个数字里面选 k 个数 path 的大小为k就return
        if (path.size() == k) {
            List<Integer> temp = new ArrayList<>(path);
            result.add(temp);
            return;
        }
        for (int i = startIndex; i <= n; i++) {
            // 剪枝操作
            //i
            path.push(i);
            // path 需要以参数的形式带进入，否则每次new 不能带入 path 无法更新
            // 递归 纵向展开
            backtracking(n, k, i + 1, result, path);
            // 回溯
            path.pop();
        }
    }
}
