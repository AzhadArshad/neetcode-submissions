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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        helper(root,0,results);
        return results;
    }
    private void helper(TreeNode root,int depth,List<Integer> results){
        if(root!=null){
            if (depth == results.size()) {
            results.add(root.val);
        }
            helper(root.right,depth + 1,results);
            helper(root.left, depth + 1, results);
    }
        }
    }

