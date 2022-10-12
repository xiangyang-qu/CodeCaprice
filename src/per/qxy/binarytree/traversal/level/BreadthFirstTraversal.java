package per.qxy.binarytree.traversal.level;

import per.qxy.binarytree.TreeNode;

import java.util.*;

public class BreadthFirstTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            // size 需要固定，循环时会通过拿到的节点往queue里面添加节点对象，queue的长度发生了变化
            int size = queue.size();
            List<Integer> nodeValues = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode peek = queue.poll();
                if (peek != null) {
                    int val = peek.val;
                    nodeValues.add(val);
                    // 不进行判空 添加空数组
                    if (peek.left != null) {
                        queue.add(peek.left);
                    }
                    if (peek.right != null) {
                        queue.add(peek.right);
                    }
                }
            }
            result.add(nodeValues);
        }
        return result;
    }


}
