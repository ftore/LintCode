package dynamicprogramming;

public class BackpackII {
	/**
     * @param m: An integer m denotes the size of a backpack
     * @param A & V: Given n items with size A[i] and value V[i]
     * @return: The maximum value
     */
	public int backPackII(int m, int[] A, int V[]) {
		// write your code here
		int last[] = new int[m + 1];
		int cur[] = new int[m + 1];
		cur[0] = 0;
		for (int i = 0; i < A.length; i++) {
			System.arraycopy(cur, 0, last, 0, cur.length);
			for (int s = 1; s <= m; s++) {
				if (s >= A[i]) {
					cur[s] = Math.max(last[s], Math.max(V[i] + last[s - A[i]], cur[s - 1]));
				} else {
					cur[s] = Math.max(last[s], cur[s - 1]);
				}
			}
		}
		return cur[m];
	}
}
