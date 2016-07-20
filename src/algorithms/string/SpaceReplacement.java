package algorithms.string;

import java.util.ArrayList;
import java.util.List;

public class SpaceReplacement {
	/**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public static int replaceBlank(char[] string, int length) {
    	List<Integer> indexes = new ArrayList<>();
    	for(int i = 0; i < string.length; i++) {
    		if(string[i] == ' ') {
    			indexes.add(i);
    		}
    	}
    	
    	int nlength = string.length + indexes.size() * 2;
    	char[] nstring = new char[nlength];
    	
    	for(int i = 0, j = 0; i < string.length && j < nlength; i++, j++) {
    		if(string[i] == ' ') {
    			nstring[j] = '%';
    			nstring[++j] = '2';
    			nstring[++j] = '0';
    		} else {
    			nstring[j] = string[i];
    		}
    	}
    	string = nstring;
    	System.out.println(string);
    	
    	return nlength;
    }
    
    public static void main(String[] args) {
    	
    	char[] str = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
    	int len = replaceBlank(str, 11);
    	System.out.println(len);
    	
    }
}
