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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = find(root, x);
        TreeNode yy = find(root, y);

        if(level(root,xx,0)==level(root,yy,0)&&!isSibling(root,xx,yy)){
            return true;
        } 
        else{
            return false;
        }
    }

    public TreeNode find(TreeNode node,int x){
        if(node == null){
            return null;
        }
        if(node.val == x){
            return node;
        }
        TreeNode left = find(node.left,x);
        if(left != null){
           return left;
        }
        return find(node.right,x);
    }

    public int level(TreeNode node,TreeNode xx, int lev){
        if(node == null){
            return -1;
        }
        if(node==xx){
            return lev;
        }
        int l=level(node.left,xx,lev+1);
        if(l != -1){
            return l;
        }
        return level(node.right,xx,lev+1);
    }


    public boolean isSibling(TreeNode node,TreeNode xx,TreeNode yy){
        if(node == null){
            return false;
        }
        return (
      (node.left == xx && node.right == yy) || (node.left == yy && node.right == xx)
      || isSibling(node.left, xx, yy) || isSibling(node.right, xx, yy)
    );
    }
}