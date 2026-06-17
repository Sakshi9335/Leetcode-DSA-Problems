class Solution {
    class Pair {
        int height;
        boolean balanced;
        Pair(int height, boolean balanced) {
            this.height = height;
            this.balanced = balanced;
        }
    }
    public boolean isBalanced(TreeNode root) {
        Pair ans = helper(root);
        return ans.balanced;
    }
    public Pair helper(TreeNode root) {
        if (root == null) {
            return new Pair(0, true);
        }
        Pair left = helper(root.left);
        Pair right = helper(root.right);
        int height = Math.max(left.height, right.height) + 1;
        boolean balanced = left.balanced && right.balanced && Math.abs(left.height - right.height) <= 1;

        return new Pair(height, balanced);
    }
}