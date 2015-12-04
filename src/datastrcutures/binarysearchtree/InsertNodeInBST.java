package datastrcutures.binarysearchtree;

import datastructures.binarytree.TreeNode;

public class InsertNodeInBST {
	/**
	 * @param root:
	 *            The root of the binary search tree.
	 * @param node:
	 *            insert this node into the binary search tree
	 * @return: The root of the new binary search tree.
	 */
	public TreeNode insertNode(TreeNode root, TreeNode node) {
		// write your code here
		if (root == null)
			return node;

		TreeNode curr = root;

		while (curr != null) {
			if (curr.val > node.val && curr.left != null) {
				curr = curr.left;
			} else if (curr.val < node.val && curr.right != null) {
				curr = curr.right;
			} else
				break;
		}

		if (curr.val > node.val) {
			curr.left = node;
		} else
			curr.right = node;

		return root;
	}
}
