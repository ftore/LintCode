package datastructures.binarytree;

public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		// write your code here
		if(root == null) return 0;
		
		int lmax = maxDepth(root.left);
		int rmax = maxDepth(root.right);
		
		return Math.max(lmax, rmax) + 1;
	}
	
}
