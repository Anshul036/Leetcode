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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int size = qu.size();
            List<Integer> currentLevel = new ArrayList<>(size);
            for(int i =0; i<size;i++){
                TreeNode currentNode = qu.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left != null){
                    qu.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    qu.offer(currentNode.right);
                }

            }
            ans.add(0,currentLevel);
        }

        return ans;
    }
}