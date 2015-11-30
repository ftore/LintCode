package datastructures.binarytree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {
	/**
	 * @param root
	 *            the root of the binary tree
	 * @return all root-to-leaf paths
	 */
	public List<String> binaryTreePaths(TreeNode root) {
		// Write your code here

		List<String> pathList = new LinkedList<>();

		createAllPathToLeaf(root, new int[1000], 0, pathList);
		return pathList;
	}

	public void createAllPathToLeaf(TreeNode root, int[] path, int len, List<String> pathList) {
		if(root == null) return;
		
		// store data in array
		path[len] = root.val;
		len++;
		
		// leaf node is reached
		if(root.left == null && root.right == null) {
			addToList(pathList, path, len);
			return;
		}
		
		createAllPathToLeaf(root.left, path, len, pathList);
		createAllPathToLeaf(root.right, path, len, pathList);
	}
	
	public void addToList(List<String> pathList, int[] path, int len) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < len; i++) {
			if(i != 0) {
				sb.append("->");
			}
			sb.append(path[i]);
		}
		pathList.add(sb.toString());
	}
}
