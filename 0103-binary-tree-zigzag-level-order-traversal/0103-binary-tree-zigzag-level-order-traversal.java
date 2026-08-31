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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        int lev = 0;

        while (!qu.isEmpty()) {
            int levelSize = qu.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = qu.poll();
                if (lev % 2 == 0) {
                    currentLevel.add(currentNode.val);
                } else if (lev % 2 != 0) {
                    currentLevel.add(0, currentNode.val);

                }
                if (currentNode.left != null) {
                    qu.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    qu.offer(currentNode.right);
                }
            }
            ans.add(currentLevel);
            lev++;
        }

        return ans;
    }
}