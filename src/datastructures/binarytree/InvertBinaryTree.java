package datastructures.binarytree;

public class InvertBinaryTree {
	/**
	 * @param root:
	 *            a TreeNode, the root of the binary tree
	 * @return: nothing
	 */
	public void invertBinaryTree(TreeNode root) {
		// write your code here
		if(root == null)
			return;
		
		TreeNode left = root.left;
		root.left = root.right;
		root.right = left;
		
		invertBinaryTree(root.left);
		invertBinaryTree(root.right);
	}
}
