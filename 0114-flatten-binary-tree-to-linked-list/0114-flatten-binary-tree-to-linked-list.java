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
         TreeNode prev=null;
    public void flatten(TreeNode root) {
        linkedlist(root);
        
    }
    public void linkedlist(TreeNode root){
        if(root == null) return;
        linkedlist(root.right);
        linkedlist(root.left);
        root.right=prev;
        root.left=null;
        prev=root;
    }
    
}