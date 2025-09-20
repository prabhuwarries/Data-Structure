package ArrayNewLeetCodeProblem;

public class sortedArrayToBST {
    public TreeNode Solution(int[] nums) {
        return  helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, left, mid - 1);
        node.right = helper(nums, mid + 1, right);
        return node;
    }

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        sortedArrayToBST obj = new sortedArrayToBST();
        int[] nums = {-10, -3, 0, 3, 9};
        TreeNode result = obj.Solution(nums);
        System.out.println("Root of the BST: " + result.val); // Example output

        int [] nums2 = {1, 3};
        TreeNode result2 = obj.Solution(nums2);
        System.out.println("Root of the BST: " + result2.val); // Example output
    }
}
