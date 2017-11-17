class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class MaximumBinaryTree {

    class Solution {
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            return getMax(0, nums.length - 1, nums);
        }

        TreeNode getMax(int l, int r, int[] nums) {

            if (l > r) {
                return null;
            }
            int max = nums[l];
            int current = l;
            for (int i = l + 1; i <= r; i++) {
                if (max < nums[i]) {
                    max = nums[i];
                    current = i;
                }
            }
            TreeNode root = new TreeNode(max);
            root.left = getMax(l, current - 1, nums);
            root.right = getMax(current + 1, r, nums);
            return root;
        }
    }

}
