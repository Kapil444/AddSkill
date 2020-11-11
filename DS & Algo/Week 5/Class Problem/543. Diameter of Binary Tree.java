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
    private int res = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) { 
       if(root==null)
           return 0;
         diameter(root); 
        return res-1;
    }
    
    public int diameter(TreeNode root){
        
        if(root==null){
            return 0;
        }
        
       int l = diameter(root.left);
        int r = diameter(root.right);
        
        int temp = 1+Math.max(l,r);
        int ans = Math.max(temp,l+r+1);
        this.res = Math.max(ans,res);
        return temp;        
    }
}
