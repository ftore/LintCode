package algorithms.search;

public class Search2DMatrix {
	/**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
	public static boolean searchMatrix(int[][] matrix, int target) {
		for(int i = 0; i < matrix.length; i++) {
			if(binarySearch(matrix[i], target) >= 0) {
				return true;
			}
		}
		
		return false;
	}
	
	private static int binarySearch(int[] arr, int k) {
		int lo = 0;
		int hi = arr.length - 1;
		
		while(hi >= lo) {
			int mid = lo + (hi - lo) / 2;
			if(arr[mid] > k) {
				hi = mid - 1;
			} else if(arr[mid] < k) {
				lo = mid + 1;
			} else return mid;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
				};
		int target = 7;
		
		if(searchMatrix(matrix, target)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
