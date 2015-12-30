package datastructures.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedArray2 {
	/**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
	public ArrayList<Integer> mergeSortedArray(ArrayList<Integer> A, ArrayList<Integer> B) {
		// write your code here
		A.addAll(B);
		Collections.sort(A);
		return A;
	}
	
	public static void main(String[] args) {
		
	}
}
