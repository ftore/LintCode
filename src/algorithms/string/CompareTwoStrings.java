package algorithms.string;

import java.util.HashMap;
import java.util.Map;

public class CompareTwoStrings {
	/**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public static boolean compareStrings(String A, String B) {
        // write your code here
    	boolean contains = true;
    	
    	if("".equals(B)) return true;
    	if("".equals(A)) return false;
    	
    	Map<Character, Integer> aMap = new HashMap<>();
    	Map<Character, Integer> bMap = new HashMap<>();
    	
    	for(int i = 0; i < A.length(); i++) {
    		char c = A.charAt(i);
    		if(aMap.containsKey(c)) {
    			aMap.put(c, aMap.get(c) + 1);
    		} else {
    			aMap.put(c, 1);
    		}
    	}
    	
    	for(int i = 0; i < B.length(); i++) {
    		char c = B.charAt(i);
    		if(bMap.containsKey(c)) {
    			bMap.put(c, bMap.get(c) + 1);
    		} else {
    			bMap.put(c, 1);
    		}
    	}
    	
    	for(Map.Entry<Character, Integer> bEntry : bMap.entrySet()) {
    		if(!aMap.containsKey(bEntry.getKey())) {
    			contains = false;
    			break;
    		} else if(aMap.get(bEntry.getKey()) < bEntry.getValue()) {
    			contains = false;
    			break;
    		}
    	}
    	
    	return contains;
    }
    
    public static void main(String[] args) {
    	String a = "ABCDEFG";
    	String b = "ACC";
    	
    	System.out.println("" + compareStrings(a, b));
    }
}
