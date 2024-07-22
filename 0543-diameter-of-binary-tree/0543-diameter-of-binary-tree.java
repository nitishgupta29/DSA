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
    int maxi=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int lh=heightBt(root.left);
        int rh=heightBt(root.right);
        maxi=Math.max(maxi,lh+rh);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return maxi;
    }
    int heightBt(TreeNode root){
        if(root==null) return 0;
        int lh=heightBt(root.left);
        int rh=heightBt(root.right);
        return 1+Math.max(lh,rh);
    }
}