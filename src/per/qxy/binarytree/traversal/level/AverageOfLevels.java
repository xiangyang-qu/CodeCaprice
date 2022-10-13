package per.qxy.binarytree.traversal.level;

import per.qxy.binarytree.TreeNode;

import java.util.*;

/**
 * @ClassName AverageOfLevels
 * @Description
 * @Date 2022/10/12 下午5:02
 * @Created by qxy
 */


public class AverageOfLevels {

    public List<Double> solution(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        // 先放入根节点
        queue.add(root);
        while (queue.size() > 0) {
            int size = queue.size();
            double sum = 0.0;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll != null) {
                    if (poll.left != null) {
                        queue.add(poll.left);
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
                    }
                    int val = poll.val;
                    sum += val;
                }
            }
            result.add(sum / size);
        }
        return result;
    }

}
