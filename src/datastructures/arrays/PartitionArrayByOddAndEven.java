package datastructures.arrays;

public class PartitionArrayByOddAndEven {
	
	/**
     * @param nums: an array of integers
     * @return: nothing
     */
	public static void partitionArray(int[] nums) {
		// write your code here;
		if(nums.length == 0 || nums.length == 1) return;
		
		int lo = -1;
		int hi = nums.length;
		
		while(true) {
			
			while(true) {
				if(nums[++lo] % 2 == 0)
				break;
			}
			
			while(true) {
				if(nums[--hi] %2 != 0)
				break;
			}
			
			if(lo >= hi) break;
			
			swap(nums, lo, hi);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void main(String[] args) {
		int[] nums = {2147483644,2147483645,2147483646,2147483647};
		
		partitionArray(nums);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
	}
}
