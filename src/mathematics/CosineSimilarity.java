package mathematics;

public class CosineSimilarity {
	
	/**
     * @param A: An integer array.
     * @param B: An integer array.
     * @return: Cosine similarity.
     */
	public double cosineSimilarity(int[] A, int[] B) {
		// write your code here
		double product = 0.0;
		double normA = 0.0;
		double normB = 0.0;
		
		for(int i = 0; i < A.length; i++) {
			product += A[i] * B[i];
			normA += Math.pow(A[i], 2);
			normB += Math.pow(B[i], 2);
		}
		if(normA == 0 && normB == 0) return 2.00;
		return product / (Math.sqrt(normA) * Math.sqrt(normB));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
