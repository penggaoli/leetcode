package leetcode.leetcode95;

import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class LeetCode95 {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode>[][] trees = new ArrayList[n + 2][n + 2];

        for (int i = 1; i <= n; i++) {
            List<TreeNode> treeList = new ArrayList<TreeNode>();
            treeList.add(new TreeNode(i));
            trees[i][i] = treeList;
        }

        for (int i = 2; i <= n; i++) {
            int j = 1;
            int k = i;
            while (j <= n && k <= n) {
                List<TreeNode> treeNodes = new ArrayList<TreeNode>();
                trees[j][k] = treeNodes;
                for (int m = j; m <= k; m++) {
                    List<TreeNode> lefts = trees[j][m - 1];
                    List<TreeNode> rights = trees[m + 1][k];
                    if (lefts == null || lefts.size() < 1) {
                        for (TreeNode right : rights) {
                            TreeNode root = new TreeNode(m);
                            root.right = right;
                            treeNodes.add(root);
                        }
                    } else if (rights == null || rights.size() < 1) {
                        for (TreeNode left : lefts) {
                            TreeNode root = new TreeNode(m);
                            root.left = left;
                            treeNodes.add(root);
                        }
                    } else {
                        for (TreeNode right : rights) {
                            for (TreeNode left : lefts) {
                                TreeNode root = new TreeNode(m);
                                root.right = right;
                                root.left = left;
                                treeNodes.add(root);
                            }
                        }
                    }
                }
                j++;
                k++;
            }
        }
        return trees[1][n];
    }
}
