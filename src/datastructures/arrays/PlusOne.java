package datastructures.arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		a = plusOne(a);
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
		int[] b = {9, 9, 9};
		b = plusOne(b);
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ", ");
		}
	}
	
	/**
     * @param digits a number represented as an array of digits
     * @return the result
     */
	public static int[] plusOne(int[] digits) {
		// Write your code here
		boolean addOne = true;
		
		for(int i = digits.length - 1; i >= 0; i--) {
			if(addOne) {
				int sum = digits[i] + 1;
				if(sum >= 10) {
					digits[i] = sum % 10;
					addOne = true;
				} else {
					digits[i] = sum;
					addOne = false;
				}
			}
		}
		
		if(addOne) {
			int[] newDigits = new int[digits.length + 1];
			newDigits[0] = 1;
			for(int i = 0; i < digits.length; i++) {
				newDigits[i + 1] = digits[i];
			}
			
			digits = newDigits;
		}
		
		return digits;
	}

}
