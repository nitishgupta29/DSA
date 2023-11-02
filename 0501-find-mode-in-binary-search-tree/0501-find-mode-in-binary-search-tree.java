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
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> m=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            m.put(curr.val,m.getOrDefault(curr.val,0)+1);
            if(curr.left!=null){
               q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        int max=0;
        for(int key:m.keySet()){
            max=Math.max(max,m.get(key));
        }
        List<Integer> ans = new ArrayList();
        for(int key:m.keySet()){
            if(m.get(key)==max){
                ans.add(key);
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        
        return result;
    }
}