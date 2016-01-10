package algorithms.string;

public class ValidPalindrome {
	/**
     * @param s A string
     * @return Whether the string is a valid palindrome
     */
	public boolean isPalindrome(String s) {
		// Write your code here
		if("".equals(s)) return true;
		
		s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		int lo = 0;
		int hi = s.length() - 1;
		
		while(lo <= hi) {
			if(s.charAt(lo) == s.charAt(hi)) {
				lo++;
				hi--;
			} else {
				return false;
			}
		}
		
		return true;
	}
}
