package com.algo.leetcode.tree.binary.bst.search;

import com.algo.leetcode.tree.binary.TreeNode;

import java.util.Objects;

public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (Objects.isNull(root)) {
            return null;
        }

        if (val < root.val) {
            return searchBST(root.left, val);
        } else if (val > root.val) {
            return searchBST(root.right, val);
        }
        return root;
    }
}
