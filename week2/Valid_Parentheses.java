// package week2;

import java.util.Stack;

public class Valid_Parentheses {

    // This method checks whether the parentheses string is valid
    public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        // If only one character, it can't be valid
        if (s.length() == 1) return false;

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else {

                // If stack is empty, no matching opening
                if (st.isEmpty()) return false;

                // Check matching pair
                if (ch == ')' && st.peek() == '(') {
                    st.pop();
                } 
                else if (ch == '}' && st.peek() == '{') {
                    st.pop();
                } 
                else if (ch == ']' && st.peek() == '[') {
                    st.pop();
                } 
                // Mismatch case
                else {
                    return false;
                }
            }
        }

        // If stack empty → valid parentheses
        return st.isEmpty();
    }

    // Main function
    public static void main(String[] args) {

        // Example input
        String s = "{[()]}";

        // Call method directly
        boolean result = isValid(s);

        // Print result
        System.out.println("Is valid parentheses? " + result);
    }
}