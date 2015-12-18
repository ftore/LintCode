package algorithms.string;

import java.util.Arrays;

public class TwoStringsAreAnagrams {
	/**
	 * @param s:
	 *            The first string
	 * @param b:
	 *            The second string
	 * @return true or false
	 */
	public boolean anagram(String s, String t) {
		// write your code here
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();

		Arrays.sort(sChar);
		Arrays.sort(tChar);

		String ss = new String(sChar);
		String tt = new String(tChar);

		return ss.equals(tt);
	}
}
