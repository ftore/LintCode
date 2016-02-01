package dynamicprogramming;

public class Backpack {
	
	/**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
	public static int backPack(int m, int[] A) {
		int[] store = new int[m + 1];
		
		for (int i = 0; i < A.length; i++) {
			for (int j = m; j >= 0; j--) {
				if (j >= A[i]) {
					store[j] = Math.max(store[j], A[i] + store[j - A[i]]);
				}
			}
		}
		return store[m];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] items = {2, 3, 5, 7};
		int m = 11;
		
		int max = backPack(m, items);
		System.out.println(max);
	}
}
