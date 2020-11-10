
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        queue1.add(p);
        queue2.add(q);
        while(queue1.size()>0 && queue2.size()>0){
            TreeNode temp1 = queue1.peek();
            TreeNode temp2 = queue2.peek();
            queue1.remove();
            queue2.remove();
            if(temp1.val!=temp2.val){
                return false;
            }
            if(temp1.left!=null&&temp2.left!=null){
                queue1.add(temp1.left);
                queue2.add(temp2.left);
            }
            if(temp1.left==null && temp2.left!=null || temp2.left==null && temp1.left!=null){
                return false;
            }
            if(temp1.right!=null&&temp2.right!=null){
                queue1.add(temp1.right);
                queue2.add(temp2.right);
            }
            if(temp1.right==null && temp2.right!=null || temp2.right==null && temp1.right!=null){
                return false;
            }
        }
        System.out.println(queue1.size() + " "+queue2.size());
        if(queue2.size()>0 || queue1.size()>0)
             return false;
        else
            return true;
    }
}
