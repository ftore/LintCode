package dynamicprogramming;

public class ClimbingStairs {
	private int[] memory;
	
	/**
     * @param n: An integer
     * @return: An integer
     */
	public int climbStairs(int n) {
		// write your code here
		memory = new int[n + 1];
		
		return climb(n);
	}
	
	public int climb(int n) {
		if(n <= 2) {
			memory[n] = n;
		}
		
		if(memory[n] > 0) 
			return memory[n];
		else
			memory[n] = climb(n - 1) + climb(n - 2);
		return memory[n];
	}
	
	public static void main(String[] args) {
		ClimbingStairs cs = new ClimbingStairs();
		
		System.out.println(cs.climbStairs(3));
	}
}
