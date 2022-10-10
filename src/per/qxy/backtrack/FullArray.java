package per.qxy.backtrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @program: CodeCaprice
 * @description:
 * @author: quxiangyang
 * @create: 2022-10-10
 **/
public class FullArray {

    //排列使用的数据
    int[] integers = new int[10];
    //使用标签
    int[] book = new int[10];
    // 手上的数字的总数
    int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        FullArray fullArray = new FullArray();
        fullArray.n = n;
        List<String> out = new ArrayList<>();
        fullArray.dfs(out,1);
        out.forEach(System.out::println);
    }

    public void dfs(List<String> output, Integer step) {
        if (step == n + 1) {
            StringBuilder builder = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                builder.append(integers[i]);
            }
            output.add(builder.toString());
            return;
        }

        for (int i = 1; i <= n ; i++) {
            if (book[i] != 1) {
                integers[step] = i;
                book[i] = 1;
                dfs(output,step + 1);
                book[i] = 0;
            }
        }
    }
}
