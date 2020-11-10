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
    public int maxDepth(TreeNode root) {
        Queue <TreeNode> q = new LinkedList<>();
        if(root==null){
            return 0;
        }
        int depth = 0;
        q.add(root);
        q.add(null);
        while(q.size()>0){
            TreeNode temp = q.peek();
            q.remove();
            if(temp==null){
                depth++;
               if(q.size()>0)
                   q.add(null); 
            }else{
                
                if(temp.left!=null){
                    q.add(temp.left);
                }
                
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
        return depth;
    }
}
