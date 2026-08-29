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

        if(root==null) return true;
        return isMirror(root,root);
    }

    public boolean isMirror(TreeNode p,TreeNode q){
        
        if(p==null && q == null) return true;
        else if(p==null || q == null) return false;
        else if(p.val != q.val) return false;


        boolean left = isMirror(p.left,q.right);
        boolean right = isMirror(p.right,q.left);
        return left && right;
    }
}