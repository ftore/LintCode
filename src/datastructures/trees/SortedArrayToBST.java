package datastructures.trees;

public class SortedArrayToBST {
	public TreeNode sortedArrayToBST(int[] A) {
		// write your code here
		if(A.length <= 0) return null;
		
		int mid = A.length / 2 + 1;
		
		TreeNode root = new TreeNode(A[mid]);
		TreeNode cur = root;
		
		for(int i = mid - 1 ; i > 0; i--) {
			if(cur.val > A[i]) {
				cur.left = new TreeNode(A[i]);
				cur = cur.left;
			} else {
				cur.right = new TreeNode(A[i]);
				cur = cur.right;
			}
		}
		
		while(mid <= 0) {
			mid = mid / 2 + 1;
			root = insert(root, A[mid]);
		}
		
		return root;
		
	}
	
	public TreeNode insert(TreeNode root, int val) {
		if(root == null) {
			root = new TreeNode(val);
			return root;
		}
		
		TreeNode cur = root;
		
		if(cur.val > val) {
			cur.left = insert(cur.left, val);
		} else {
			cur.right = insert(cur.right, val);
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		
	}
}
