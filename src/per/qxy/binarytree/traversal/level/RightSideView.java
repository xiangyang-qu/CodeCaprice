package per.qxy.binarytree.traversal.level;

import per.qxy.binarytree.TreeNode;

import java.util.*;

/**
 * @ClassName RightSideView
 * @Description 199 最右边的元素但不一定是右节点的
 * @Date 2022/10/12 下午3:00
 * @Created by qxy
 */


public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll != null) {
                    if (poll.left != null) {
                        queue.add(poll.left);
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
                    }

                }
                if (i == size - 1) {
                    if (poll != null) {
                        result.add(poll.val);
                    }
                }
            }
        }
        return result;
    }
}
