//https://leetcode.com/problems/binary-tree-level-order-traversal/
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
        List<List<Integer>> numsMatrix = new ArrayList<List<Integer>>();        
        if(root == null) { return numsMatrix; }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> nums = new ArrayList<Integer>();
            for(int I = 0 ; I < size; I++) {
                TreeNode qNode = queue.poll();
                nums.add(qNode.val);
                if(qNode.left != null) {
                    queue.add(qNode.left);
                }
                if(qNode.right != null) {
                    queue.add(qNode.right);
                }
            }
            numsMatrix.add(nums);
        }
        return numsMatrix;
    }
}