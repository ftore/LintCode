package mathematics;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
	public static boolean isHappy(int n) {
		// Write your code here
		Set<Integer> set = new HashSet<>();
		
		while(!set.contains(n)) {
			set.add(n);
			char[] digits = String.valueOf(n).toCharArray();
			n = sum(digits);
			
			if(n == 1) return true;
		}
		
		return false;
	}
	
	public static int sum(char[] digits) {
		int sum = 0;
		for(int i = 0; i < digits.length; i++) {
			sum += (int) Math.pow(Character.getNumericValue(digits[i]), 2);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		
		System.out.println(isHappy(i));
	}
}
