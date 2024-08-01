// https://leetcode.com/problems/symmetric-tree/
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
    public boolean isSymmetric(TreeNode first, TreeNode second) {      
        if(first == null && second == null)
            return true;
        if(first == null || second == null)
            return false;
        if(first.val != second.val)
            return false;
        return this.isSymmetric(first.left, second.right) && 
               this.isSymmetric(first.right, second.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root != null)
            return isSymmetric(root.left, root.right);
        return true;
    }
}