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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> list = new ArrayList<>();
        while(q.size()>0){
            TreeNode temp = q.peek();
            q.remove();
            if(temp==null){
                res.add(list);
                list = new ArrayList<>();
                if(q.size()>0){
                    q.add(null);
                }
            }else{
                list.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
        return res;
    }
}
