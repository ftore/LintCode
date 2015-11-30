package datastructures.binarytree;

import java.util.Stack;

public class FlattenBinaryTreeToLinkedList {
	/**
	 * @param root:
	 *            a TreeNode, the root of the binary tree
	 * @return: nothing
	 */
	public void flatten(TreeNode root) {

		Stack<TreeNode> stack = new Stack<>();
		TreeNode curr = root;
		
		while(curr != null || !stack.empty()) {
			if(curr.right != null) {
				stack.push(curr.right);
			}
			
			if(curr.left != null) {
				curr.right = curr.left;
				curr.right = null;
			} else if(!stack.empty()) {
				TreeNode tmp = stack.pop();
				curr.right = tmp;
			}
			
			curr = curr.right;
		}
	}
}
