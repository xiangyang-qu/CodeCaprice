package per.qxy.binarytree.traversal.level;

import per.qxy.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Classname LargestValues
 * @Description TODO
 * @Date 2022/10/13 23:34
 * @Created by qxy20
 */
public class LargestValues {

    public List<Integer> solution(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return result;
        }
        queue.add(root);
        while (queue.size() > 0) {
            int size = queue.size();
            int temp = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll != null) {
                    if (poll.left != null) {
                        queue.add(poll.left);
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
                    }
                    if (poll.val > temp) {
                        temp = poll.val;
                    }
                }
            }
            result.add(temp);
        }
        return result;
    }
}
