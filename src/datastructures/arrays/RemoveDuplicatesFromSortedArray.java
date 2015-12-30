package datastructures.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
	
	/**
     * @param A: a array of integers
     * @return : return an integer
     */
	public static int[] removeDuplicates(int[] nums) {
		if(nums.length <= 1) return nums;
		int j = 1; 
		int i = 2;
		while(i < nums.length) {
			if(nums[i] == nums[j] && nums[i] == nums[j - 1]) {
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
		int[] A = {1,1,1,2};
		A = removeDuplicates(A);
		
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + ", ");
		}
	}

}
