package binary;

public class AddBinary {
	/**
     * @param a a number
     * @param b a number
     * @return the result
     */
	public String addBinary(String a, String b) {
		// Write your code here
		int sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
		return Integer.toBinaryString(sum);
	}
}
