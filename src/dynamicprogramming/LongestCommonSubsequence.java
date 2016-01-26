package dynamicprogramming;

public class LongestCommonSubsequence {
	/**
	 * 
     * @param A, B: Two strings.
     * @return: The length of longest common subsequence of A and B.
     */
	public int longestCommonSubsequence(String A, String B) {
		// write your code here
		int[][] table = new int[A.length() + 1][B.length() + 1];
		
		for(int i = 0; i <= A.length(); i++) {
			for(int j = 0; j <= B.length(); j++) {
				if(i == 0 || j == 0) {
					table[i][j] = 0;
				} else if(A.charAt(i - 1) == B.charAt(j - 1)) {
					table[i][j] = table[i - 1][j - 1] + 1;
				} else {
					table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
				}
			}
		}
		
		return table[A.length()][B.length()];
	}
}
