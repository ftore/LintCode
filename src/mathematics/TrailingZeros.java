package mathematics;

public class TrailingZeros {

	public static void main(String[] args) {
		System.out.println(trailingZeros(105));

	}
	
	/*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
	public static long trailingZeros(long number) {
		long count = 0;

		if (number < 0) {

			System.out.println("Error: There is no Factorial for a number less than 0");

			return -1; // error condition

		}

		if (number == 5) {
			return 1;
		}

		/*
		 * start from 5, multiply j by 5 each loop, but stop iterating when
		 * number/j is no longer greater than 1
		 */
		for (long j = 5; number / j >= 1; j *= 5) {
			/*
			 * assuming that number/j will just give you the integer result of
			 * the division of number/j and also truncate:
			 */
			count += number / j;
		}

		return count;
	}

}
