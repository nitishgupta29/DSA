/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int ans = 0;
    public int averageOfSubtree(TreeNode root) {
        traverse(root);
        return ans;
    }

    private int[] traverse(TreeNode node) {
        if (node == null) return new int[]{0, 0};
        
        int[] left = traverse(node.left);
        int[] right = traverse(node.right);
        
        int currSum = node.val + left[0] + right[0];
        int currCount = 1 + left[1] + right[1];
        
        if (currSum / currCount == node.val) ans++;
        
        return new int[]{currSum, currCount};
    }
}