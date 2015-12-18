package algorithms.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
	/**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        // write your code here
        List<String> anagramList = new ArrayList<>();
        
        for(int i = 1; i < strs.length; i++) {
        	for(int j = 0; j < i; j++) {
	        	if(anagram(strs[j], strs[i])) {
	        		if(i == 1) {
	        			anagramList.add(strs[i - 1]);
	        		}
	        		anagramList.add(strs[j]);
	        		continue;
	        	}
        	}
        }
        return anagramList;
    }
    
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
