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
    public void preorder(TreeNode root, List<Integer> nums) {
        if(root == null)
            return;
        nums.add(root.val);
        preorder(root.left, nums);
        preorder(root.right, nums);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nums = new ArrayList<Integer>();
        preorder(root, nums);
        return nums;
    }
}