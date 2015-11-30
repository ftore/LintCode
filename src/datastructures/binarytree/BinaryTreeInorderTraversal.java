package datastructures.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		// write your code here
		ArrayList<Integer> nodesList = new ArrayList<>();

		traverse(root, nodesList);

		return nodesList;
	}
	
	public void traverse(TreeNode root, List<Integer> nodesList) {
		if (root == null)
			return;

		nodesList.add(root.val);
		traverse(root.left, nodesList);
		traverse(root.right, nodesList);
	}
}
