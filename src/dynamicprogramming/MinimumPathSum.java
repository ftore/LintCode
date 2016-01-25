package dynamicprogramming;

public class MinimumPathSum {
	/**
     * @param grid: a list of lists of integers.
     * @return: An integer, minimizes the sum of all numbers along its path
     */
	public static int minPathSum(int[][] grid) {
		// write your code here
		if(grid == null || grid.length == 0)
			return 0;
		
		int m = grid.length;
		int n = grid[0].length;
		
		int[][] dp = new int[m][n];
		dp[0][0] = grid[0][0];
		
		// initialize top row
		for(int i = 1; i < n; i++) {
			dp[0][i] = dp[0][i - 1] + grid[0][i];
		}
		
		// initialize left column
		for(int i = 1; i < m; i++) {
			dp[i][0] = dp[i - 1][0] + grid[i][0];
		}
		
		// fill up the dp table
		for(int i = 1; i < m; i++) {
			for(int j = 1; j < n; j++) {
				if(dp[i - 1][j] > dp[i][j - 1]) {
					dp[i][j] = dp[i][j - 1] + grid[i][j];
				} else {
					dp[i][j] = dp[i - 1][j] + grid[i][j];
				}
			}
		}
		
		return dp[m - 1][n - 1];
	}
	
	public static void main(String[] args) {
		int[][] matrix={
				{0,	100,	1,	1,	1},
				{1,	1,		1, 100,	1},
				{100,100,	100,100, 1}, 
				{100, 100, 100, 100, 1},
				{100, 100, 100, 100, 3}
		};
		
		int res = minPathSum(matrix);
		System.out.println(res);
	}
}
