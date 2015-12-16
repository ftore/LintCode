package algorithms.sorting.quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KthLargestElement {
	// param k : description of k
	// param numbers : array of numbers
	// return: description of return
	public static int kthLargestElement(int k, ArrayList<Integer> numbers) {
		// write your code here
		Collections.sort(numbers);
		
		int num = 0;
		for(int i = numbers.size() - 1; i > numbers.size() - k - 1; i--) {
			if(i == numbers.size() - k) {
				num = numbers.get(i);
			}
		}
		
		return num;
	}
	
	/**
	 * @param nums:
	 *            A list of integers.
	 * @return: An integer denotes the middle number of the array.
	 */
	public int median(int[] nums) {
		// write your code here
		Arrays.sort(nums);
		int index = nums.length % 2 == 0 ? (nums.length - 1) / 2 : nums.length / 2;
		return nums[index];
	}
	
	public static void main(String[] args) {
		
	}
}
