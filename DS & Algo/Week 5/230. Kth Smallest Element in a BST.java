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
    static int count = 0;
    static int res = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return res;
    }
    public void inorder(TreeNode temp,int k){
        if(temp==null){
            return ;
        }
        inorder(temp.left,k);
        count++;
        if(k==count){
            res = temp.val;
        }       
         inorder(temp.right,k);
    }
}
