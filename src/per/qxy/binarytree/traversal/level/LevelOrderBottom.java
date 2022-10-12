package per.qxy.binarytree.traversal.level;

import per.qxy.binarytree.TreeNode;

import java.util.*;

/**
 * @ClassName LevelOrderBottom
 * @Description leetcode 107
 * @Date 2022/10/12 下午2:30
 * @Created by qxy
 */


public class LevelOrderBottom {
    public List<List<Integer>> solution(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> temp = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> itemInResult = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll != null) {
                    itemInResult.add(poll.val);
                    if (poll.left != null) {
                        queue.add(poll.left);
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
                    }
                }
            }
            temp.add(itemInResult);
        }


        for (int i = temp.size() - 1; i >= 0 ; i--) {
            result.add(new ArrayList<>(temp.get(i)));
        }
        return result;
    }
}
