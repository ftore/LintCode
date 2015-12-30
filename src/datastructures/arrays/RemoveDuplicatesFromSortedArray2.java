package datastructures.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray2 {
	
	/**
     * @param A: a array of integers
     * @return : return an integer
     */
	public static int[] removeDuplicates(int[] nums) {
		if(nums.length <= 1) return nums;
		int j = 0; 
		int i = 1;
		while(i < nums.length) {
			if(nums[i] == nums[j]) {
				i++;
			} else {
				j++;
				nums[j] = nums[i];
				i++;
			}
		}
		
		nums = Arrays.copyOf(nums, j + 1);
		
		return nums;
	}

	public static void main(String[] args) {
		int[] A = {1,1,2};
		A = removeDuplicates(A);
		
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + ", ");
		}
	}

}
