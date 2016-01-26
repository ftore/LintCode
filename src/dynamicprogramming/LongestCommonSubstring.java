package dynamicprogramming;

public class LongestCommonSubstring {
	/**
	 * Runs in O(A.length() * B.length()) time
	 * 
	 * @param A, B: Two string.
	 * @return: the length of the longest common substring.
	 * 
	 */
	public int longestCommonSubstring(String A, String B) {
		// write your code here
		int[][] table = new int[A.length() + 1][B.length() + 1];
		int max = 0;
		
		for(int i = 0; i <= A.length(); i++) {
			for(int j = 0; j <= B.length(); j++) {
				if(i == 0 || j == 0) {
					table[i][j] = 0;
				} else if(A.charAt(i - 1) == B.charAt(j - 1)) {
					table[i][j] = table[i - 1][j - 1] + 1;
					max = Math.max(table[i][j], max);
				} else {
					table[i][j] = 0;
				}
			}
		}
		
		return max;
	}
}
