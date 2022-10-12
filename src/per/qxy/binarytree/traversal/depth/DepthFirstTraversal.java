package per.qxy.binarytree.traversal.depth;

import per.qxy.binarytree.TreeNode;

import java.util.*;

public class DepthFirstTraversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }

    public static void test() {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    public void preorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        //单层处理逻辑，前序先遍历中间节点
        result.add(root.val);

        // 对左子树进行遍历
        preorder(root.left, result);

        // 对右子树进行遍历
        preorder(root.right, result);
    }

    public void postorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
    }

    public void inorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }

}
