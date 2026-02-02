package Sheet1;
//  package week2;
import java.util.Stack;

public class Remove_Outermost_Parentheses {
    public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        // Traverse each character of the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // If opening bracket
            if (ch == '(') {
                // If stack is not empty, it is NOT outermost
                if (!st.isEmpty()) {
                    sb.append(ch);
                }
                // Push '(' to stack
                st.push(ch);
            }
            // If closing bracket
            else if (ch == ')') {

                // Remove matching '('
                st.pop();
                // If stack is not empty, it is NOT outermost
                if (!st.isEmpty()) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        // Example input
        String s = "(()())(())";
        //its output is ()()() we removed 
        String result = removeOuterParentheses(s);
        System.out.println("Result: " + result);
    }
}

