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
    int nums = 0;
    public int distributeCoins(TreeNode root) {
       
        postOrder(root);
        
        return nums;
    }
    public int postOrder(TreeNode root){
        if(root==null){
            return 0;
        }
       int l =  postOrder(root.left);
       int r =  postOrder(root.right);
        nums += Math.abs(l) + Math.abs(r);
        return root.val + l + r -1;
    }
}
