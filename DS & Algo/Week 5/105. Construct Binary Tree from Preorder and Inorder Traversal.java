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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return constructTree(0,0,inorder.length-1,preorder,inorder);
    }
    public TreeNode constructTree(int preStart,int inStart,int inEnd,int []preorder,int []inorder){
        
        if(preStart>preorder.length-1 || inStart>inEnd){
            return null;
        }
        int index = 0;
        TreeNode tree = new TreeNode(preorder[preStart]);
        for(int i=inStart;i<=inEnd;i++){
            if(tree.val==inorder[i]){
                index = i;
            }
        }        
        tree.left = constructTree(preStart+1,inStart,index-1,preorder,inorder);
        tree.right = constructTree(preStart+index-inStart +1,index+1,inEnd,preorder,inorder);
        return tree;
    }
}
