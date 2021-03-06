package com.algo.leetcode.tree.binary.bst.transform.convert_to_greater_tree;

import com.algo.leetcode.tree.binary.TreeNode;

import java.util.Objects;

public class ConvertToGreaterBST {
    public TreeNode convertBST(TreeNode root) {
        if (Objects.nonNull(root)) {
            greaterSum(root, 0);
        }
        return root;
    }

    private int greaterSum(TreeNode node, int prevGreatValue) {
        if (Objects.isNull(node)) {
            return 0;
        }

        if (Objects.nonNull(node.right)) {
            prevGreatValue = greaterSum(node.right, prevGreatValue);
        }

        node.val += prevGreatValue;

        if (!Objects.nonNull(node.left)) {
            return node.val;
        } else {
            return greaterSum(node.left, node.val);
        }
    }
}
