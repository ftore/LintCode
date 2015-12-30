package datastructures.arrays;

import java.util.Arrays;

public class MergeSortedArray {
	/**
     * @param A: sorted integer array A which has m elements, 
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
	public static void mergeSortedArray(int[] A, int m, int[] B, int n) {
		// write your code here
		for(int i = (m + n) - 1, j = n - 1; i >= m; i--, j--) {
			A[i] = B[j];
		}
		Arrays.sort(A);
	}
	
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 0, 0};
		int[] B = {4, 5};
		
		mergeSortedArray(A, A.length - B.length, B, B.length);
		
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + ", ");
		}
	}
}
