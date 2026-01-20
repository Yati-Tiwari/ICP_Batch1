import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Create a stack to keep track of opening brackets
        Stack<Character> st=new Stack<>();

        // Loop through each character in the string
        for (int i=0; i<s.length(); i++) {
            char ch=s.charAt(i);

            // If it's an opening bracket, push it onto the stack
            if (ch=='(' || ch=='{' || ch=='[') {
                st.push(ch);
            } else {
                // If it's a closing bracket but stack is empty → invalid
                if (st.isEmpty()) {
                    return false;
                }
                // Peek at the top element of the stack
                char top=st.peek();

                // Check if the current closing bracket matches the top opening bracket
                if ((ch==')' && top=='(') ||
                    (ch=='}' && top=='{') ||
                    (ch ==']' && top== '[')) {
                    // If it matches, pop the opening bracket
                    st.pop();
                } else {
                    // If it doesn't match → invalid
                    return false;
                }
            }
        }
        // At the end, the stack should be empty if all brackets matched
        return st.isEmpty();
    }
}