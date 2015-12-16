package datastructures.arrays;

public class MaximumSubarray {
	
	public static int maxSubArray(int[] nums) {
		int newsum = nums[0];
		int max = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			newsum = Math.max(nums[i] + newsum, nums[i]);
			max = Math.max(max, newsum);
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,2,-3,4,-1,2,1,-5,3};
		
		System.out.println(maxSubArray(arr));
	}

}
