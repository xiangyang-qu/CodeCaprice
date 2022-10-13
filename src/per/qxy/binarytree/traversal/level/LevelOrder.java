package per.qxy.binarytree.traversal.level;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Classname LevelOrder
 * @Description TODO
 * @Date 2022/10/13 23:08
 * @Created by qxy20
 */
public class LevelOrder {

    public List<List<Integer>> solution(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if (root == null) {
            return result;
        }

        queue.add(root);

        while (queue.size() > 0) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                if (poll != null) {
                    if (poll.children != null) {
                        for (int j = 0; j < poll.children.size(); j++) {
                            if (poll.children.get(j) != null) {
                                queue.add(poll.children.get(j));
                            }
                        }
                    }
                    temp.add(poll.val);
                }
            }
            result.add(temp);
        }
        return result;
    }



    class Node{
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
