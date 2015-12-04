package strings;

import java.util.ArrayList;

public class SpaceReplacement {
	/**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
	public static int replaceBlank(char[] string, int length) {
		// Write your code here
		ArrayList<Character> charList = new ArrayList<>();

		for (int i = 0; i < length; i++) {
			if (string[i] == ' ') {
				charList.add('%');
				charList.add('2');
				charList.add('0');
			} else {
				charList.add(string[i]);
			}
		}

		char[] tmp = new char[charList.size()];
		int i = 0;
		for (Character c : charList) {
			tmp[i++] = c;
		}
		
		string = tmp;

		return charList.size();
	}
	
	public static void main(String[] args) {
		String str = "hello world";
		
		char[] string = str.toCharArray();
		
		int len = replaceBlank(string, string.length);
		
		System.out.println(new String(string));
	}
}
