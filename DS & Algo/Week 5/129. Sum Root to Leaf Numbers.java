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
    private List<String> res = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        inorder(root,"");
        int sum = 0;
        for(String s : res){
            sum = sum + Integer.parseInt(s);
         }
        return sum;
    }
    public void inorder(TreeNode root,String sum){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            res.add(sum+root.val);
        }
        inorder(root.left,sum+root.val);
        inorder(root.right,sum+root.val);
        
    }
}
