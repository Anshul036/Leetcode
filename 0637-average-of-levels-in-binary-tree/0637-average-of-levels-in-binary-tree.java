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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans =new ArrayList<>();
        if(root == null){
            return ans;
        }

        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int levelSize = qu.size();
            double average = 0;
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode = qu.poll();
                average += currentNode.val;
                if(currentNode.left != null){
                    qu.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    qu.offer(currentNode.right);
                }
            }
            ans.add(average/levelSize);

        }

        return ans;
    }
}