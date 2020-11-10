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
    public boolean isSymmetric(TreeNode root) {
        if(root==null || root.left ==null && root.right==null){
            return true;
        }
       
        return check(root,root);
    }
    public boolean check(TreeNode temp1,TreeNode temp2){
        if(temp1==null && temp2==null){
            return true;
        }
        
        if(temp1!=null && temp2!=null && temp1.val==temp2.val){
            if(check(temp1.left,temp2.right)&&check(temp1.right,temp2.left)){
                return true;
            }
        }
        return false;
    }
}
