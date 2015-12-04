package datastructures.binarytree;

public class Subree {
	/**
	 * @param T1,
	 *            T2: The roots of binary tree.
	 * @return: True if T2 is a subtree of T1, or false.
	 */
	public boolean isSubtree(TreeNode T1, TreeNode T2) {
		// base case
		if(T2 == null)
			return true;
		
		if(T1 == null)
			return false;
		
		// check the tree with root as current node
		if(areIdentical(T1, T2))
			return true;
		
		/* If the tree with root as current node doesn't match then
	       try left and right subtrees one by one */
		return isSubtree(T1.left, T2) || isSubtree(T1.right, T2);
	}
	
	public boolean areIdentical(TreeNode root1, TreeNode root2) {
		// base cases
		if(root1 == null && root2 == null)
			return true;
		
		if(root1 == null || root2 == null)
			return false;
		
		// check if the data of both roots is the same and data of left and right
		// subtrees are also the same
		return root1.val == root2.val 
				&& areIdentical(root1.left, root2.left)
				&& areIdentical(root1.right, root2.right);
	}
}
