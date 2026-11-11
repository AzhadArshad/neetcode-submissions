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
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> nums = new ArrayList<>();
        inorderHelper(root,nums);
        return nums;
        }
    private void inorderHelper(TreeNode root,List<Integer> nums){
        if(root!=null){
            inorderHelper(root.left,nums);
            nums.add(root.val);
            inorderHelper(root.right,nums);
        }
    }

    }
