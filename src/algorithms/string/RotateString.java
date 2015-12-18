package algorithms.string;

public class RotateString {
	/**
     * @param str: an array of char
     * @param offset: an integer
     * @return: nothing
     */
	public static void rotateString(char[] str, int offset) {
		// write your code here
		if(offset == 0) return;
		
		char[] tmp = new char[offset];
		int j = tmp.length - 1;
		for(int i = str.length - 1; i > str.length - 1 - offset; i--) {
			tmp[j] = str[i];
			j--;
		}
		
		for(int i = str.length - 1 - offset; i >= 0; i--) {
			str[i + offset] = str[i];
		}
		
		
		for(int i = 0; i < tmp.length; i++) {
			str[i] = tmp[i];
		}
	}
	
	public static void main(String[] args) {
		char[] str = "abcdefg".toCharArray();
		
		rotateString(str, 4);
		
		System.out.println(str);
	}
}
