package per.qxy.binarytree;

import java.util.*;

/**
 * @ClassName TreeNode
 * @Description 二叉树定义
 * @Date 2022/10/12 上午11:20
 * @Created by qxy
 */


public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;}

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
