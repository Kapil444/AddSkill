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
    private boolean check = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        inorder(root,sum);
        return check;
    }
    public void inorder(TreeNode root,int sum){
        if(root==null){
            return ;
        }
        
        if(root.val == sum  && root.left==null && root.right==null){
            this.check=true;
            return ;
        }
        if(!check)
        inorder(root.left,sum-root.val);   
        if(!check)
        inorder(root.right,sum-root.val);
    }
}
