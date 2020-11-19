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
    List<Integer> first = new ArrayList<>();
    List<Integer> second = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        inorder(root1,first);
        inorder(root2,second);
        return mergeList(first,second);
    }
    public void inorder(TreeNode root,List<Integer> list){
        if(root==null){
            return ;            
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public List<Integer> mergeList(List<Integer> first,List<Integer> second){
        int i = 0,j=0;
        
        List<Integer> res = new ArrayList<>();
        while(i<first.size() && j<second.size()){
            if(first.get(i)<=second.get(j)){
                res.add(first.get(i++));
            }else{
                res.add(second.get(j++));
            }
        }
        while(i<first.size()){
            res.add(first.get(i++));
        }
        while(j<second.size()){
            res.add(second.get(j++));
        }
        return res;
    }
}
