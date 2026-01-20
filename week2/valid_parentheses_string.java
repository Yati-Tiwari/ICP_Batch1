// package week2;

public class valid_parentheses_string {

    // '(' , ')' , '*' where '*' can be '(' or ')' or empty
    public static boolean checkValidString(String s) {

        int p1 = 0; // minimum possible open brackets
        int p2 = 0; // maximum possible open brackets

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                // '(' increases both min and max open count
                p1++;
                p2++;

            } else if (ch == ')') {
                // ')' decreases open count
                if (p1 > 0) {
                    p1--;   // decrease minimum if possible
                }
                p2--;       // decrease maximum

            } else { // ch == '*'
                // Assume '*' as ')', to minimize open brackets
                if (p1 > 0) {
                    p1--;
                }

                // Assume '*' as '(', to maximize open brackets
                p2++;
            }

            // If maximum open becomes negative,
            // too many ')'  invalid string
            if (p2 < 0) {
                return false;
            }
        }

        // At end, minimum open must be zero
        return p1 == 0;
    }
    public static void main(String[] args) {

        // Example input
        String s = "(*))";

        boolean result = checkValidString(s);

        System.out.println(result);
    }
}