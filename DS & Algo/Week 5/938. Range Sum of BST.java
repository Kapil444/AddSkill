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
    private int res = 0;
    private int lo = 0;
    private int hi = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        this.lo = low;
        this.hi = high;
        inorder(root);
      return this.res;
    }
    public void inorder(TreeNode root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        
        if(root.val>=lo && root.val<=hi){
            this.res = this.res + root.val;
        }
        inorder(root.right);
    }
}
