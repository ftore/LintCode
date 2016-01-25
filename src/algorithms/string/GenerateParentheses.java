package algorithms.string;

import java.util.ArrayList;

public class GenerateParentheses {
	/**
     * @param n n pairs
     * @return All combinations of well-formed parentheses
     */
	public ArrayList<String> generateParenthesis(int n) {
		// Write your code here
		ArrayList<String> result = new ArrayList<>();
		dfs(result, "", n, n);
		return result;
	}
	
	public void dfs(ArrayList<String> result, String s, int left, int right) {
		if(left > right) {
			return;
		}
		
		if(left == 0 && right == 0) {
			result.add(s);
			return;
		}
		
		if(left > 0) {
			dfs(result, s + "(", left - 1, right);
		}
		
		if(right > 0) {
			dfs(result, s + ")", left, right - 1);
		}
	}
	
	public static void main(String[] args) {
		GenerateParentheses gp = new GenerateParentheses();
		
		ArrayList<String> result = gp.generateParenthesis(3);
		
		for(String s : result) {
			System.out.println(s);
		}
	}
}
