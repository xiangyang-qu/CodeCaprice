package per.qxy.backtrack;

import java.nio.file.Path;
import java.util.*;

/*
 * @program: CodeCaprice
 * @description: leetCode 17
 * @author: quxiangyang
 * @create: 2022-10-11
 **/
public class LetterCombinations {
    static String[] letterMap = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};


    public static void main(String[] args) {
        List<String> strings = letterCombinations("234");
        strings.forEach(System.out::println);

    }

    static List<String> letterCombinations(String digits){
        LinkedList<Character> path = new LinkedList<>();
        List<String> result = new ArrayList<>();
        backtracking(digits, 0, path, result);
        return result;
    }

    static void backtracking(String digits, Integer index, LinkedList<Character> path, List<String> result) {
        if (path.size() == digits.length()) {
            StringBuilder builder = new StringBuilder();
            for (Character character : path) {
                builder.append(character);
            }
            result.add(builder.toString());
            return;
        }

        //首先找到要被遍历的元素集合
        int digit = digits.charAt(index) - '0';
        String letters = letterMap[digit];

        //对字符集进行遍历 一定要找到被遍历的字符集
        for (int i = 0; i < letters.length() ; i++) {
            path.add(letters.charAt(i));
            // index 通过index 获取被遍历的字符集
            backtracking(digits, index + 1, path, result);
            path.removeLast();
        }
    }


}
