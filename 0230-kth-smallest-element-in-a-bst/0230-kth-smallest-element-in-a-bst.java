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
   int ans = -1;
     int K;
    public int kthSmallest(TreeNode root, int k) {
        K=k;
        solve(root);
        return ans;
    }
    public void solve(TreeNode root){
        if(root==null)  return;
        solve(root.left);
        K--;
        if(K==0) ans=root.val;
        solve(root.right);
    }
}