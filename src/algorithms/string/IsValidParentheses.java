package algorithms.string;

import java.util.Stack;

public class IsValidParentheses {
	/**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // Write your code here
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++) {
            if(c[i] == '{' || c[i] == '(' || c[i] == '[') {
                stack.push(c[i]);
            } else {
                if(stack.isEmpty()) return false;
                char c2 = stack.pop();
                
                if(c[i] == '}' && c2 != '{') return false;
                if(c[i] == ')' && c2 != '(') return false;
                if(c[i] == ']' && c2 != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}
