package datastrcutures.trees;


public class IdenticalBinaryTree {
	/**
	 * @param a, b, the root of binary trees.
	 * @return true if they are identical, or false.
	 */
	public boolean isIdentical(TreeNode a, TreeNode b) {
		// Write your code here
		if (a == null && b == null)
			return true;
		if (a == null || b == null)
			return false;
		if (a.val == b.val)
			return isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
		else
			return false;
	}
}

class TreeNode {
	public int val;
	public TreeNode left, right;
	public TreeNode(int val) {
		this.val = val;
		this.left = this.right = null;
	}
}
