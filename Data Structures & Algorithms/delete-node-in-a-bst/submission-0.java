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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return root;
        }

        if(root.val>key){
            root.left = deleteNode(root.left,key);
        }
        else if(root.val<key){
            root.right = deleteNode(root.right,key);
        }
        else{
            if(root.right == null)return root.left;
            if(root.left == null)return root.right;

            int min = minVal(root.right);
            root.val = min;
            root.right = deleteNode(root.right,min);
        }
        return root;
    }
    private int minVal(TreeNode root){
        TreeNode curr = root;
        while(curr.left!=null){
            curr = curr.left;
        }
        return curr.val;
    }
}