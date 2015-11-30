package datastructures.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
	public ArrayList<Integer> postorderTraversal(TreeNode root) {
		// write your code here
		ArrayList<Integer> nodesList = new ArrayList<>();

		traverse(root, nodesList);

		return nodesList;
	}
	
	public void traverse(TreeNode root, List<Integer> nodesList) {
		if (root == null)
			return;

		traverse(root.left, nodesList);
		traverse(root.right, nodesList);
		nodesList.add(root.val);
	}
}
