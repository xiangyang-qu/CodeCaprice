# 回溯基本内容

## 底层理解

处理过程可以视为一个决策树

回溯算法主要解决的问题：组合、切割、排列、棋盘

回溯算法的模式：遍历 + 递归 (可以使用决策树进行模拟)
遍历：横向遍历，每一层选出所有的可能性 树的宽度
递归：纵向递归，每一个子树进行递归运算 树的深度

## 书写模板

```
    void backtracking() {
        if (terminal condition) {
            save result;
            return;
        }
        
        for (chose: item of current layer colletions) {
            deal with node;
            backtracking(path, chosen list); // rescursion
            quash; // backtracking
        }
    }
```



