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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumHelper(root,targetSum,0);
    }
    private boolean hasPathSumHelper(TreeNode root, int targetSum,int acc){
        if(root==null) return false;

        acc+=root.val;

        if(root.left==null && root.right==null){
            return acc==targetSum;
        }

        return hasPathSumHelper(root.left,targetSum,acc)||
        hasPathSumHelper(root.right,targetSum,acc);
          
        
    }
}