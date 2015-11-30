package datastructures.binarytree;

public class MinimumDepthOfBinaryTree {
	public int minDepth(TreeNode root) {
		// write your code here
		if (root == null)
			return 0;

		int lmin = minDepth(root.left);
		int rmin = minDepth(root.right);
		
		if(lmin == 0 && rmin == 0) return 1;
		
		if(lmin == 0) lmin = Integer.MAX_VALUE;
		if(rmin == 0) rmin = Integer.MAX_VALUE;
		
		return Math.min(lmin, rmin) + 1;
	}
}
