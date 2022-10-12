package per.qxy.backtrack;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * @program: CodeCaprice
 * @description: leetCode 216
 * @author: quxiangyang
 * @create: 2022-10-10
 **/
public class CombinationSumIII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        int sum = 0;
        backtracking(k, n, 1, result, path, sum);
        System.out.println();


    }

   static void backtracking(int k, int n, int startIndex, List<List<Integer>> result, LinkedList<Integer> path, int sum) {
        // 递归终止条件
        if (sum > n) {
            return;
        }
        if (path.size() == k && sum == n) {
            ArrayList<Integer> integers = new ArrayList<>(path);
            result.add(integers);
            return;
        }
        if (path.size() == k) {
            return;
        }

        // 横向遍历
        for (int i = startIndex; i <= 9; i++) {
            //处理节点
            path.add(i);
            sum += i;
            //纵向递归
            backtracking(k, n, i + 1, result, path, sum);
            //所有的处理方式都要进行回溯
            path.removeLast();
            sum -= i;
        }
    }
}
