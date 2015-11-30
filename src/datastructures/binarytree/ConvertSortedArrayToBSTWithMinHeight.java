package datastructures.binarytree;

public class ConvertSortedArrayToBSTWithMinHeight {
	/**
     * @param A: an integer array
     * @return: a tree node
     */
	public TreeNode sortedArrayToBST(int[] A) {
		return sortedArrayToBST(A, 0, A.length - 1);
	}
	
	public TreeNode sortedArrayToBST(int[] A, int start, int end) {
		if(start > end) return null;
		
		// same as (start + end) / 2, avoids overflow
		int mid = start + (end - start) / 2;
		TreeNode node = new TreeNode(A[mid]);
		node.left = sortedArrayToBST(A, start, mid - 1);
		node.right = sortedArrayToBST(A, mid + 1, end);
		return node;
	}
	
	public static void main(String[] args) {
		
	}
}
