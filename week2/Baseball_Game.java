// package ICP-26week2;

import java.util.Stack;

public class Baseball_Game {
    public static int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        // Loop on all operations
        for (int i = 0; i < operations.length; i++) {
            // If operation is "C"  remove last score
            if (operations[i].equals("C")) {
                st.pop();

            // If operation is "D"  double last score
            } else if (operations[i].equals("D")) {
                int num = st.pop();
                st.push(num);        // put back original
                st.push(num * 2);    // add double value

            // If operation is "+"  sum of last two scores
            } else if (operations[i].equals("+")) {
                int n1 = st.pop();   // last score
                int n2 = st.pop();   // second last score

                // push them back
                st.push(n2);
                st.push(n1);
                // push their sum
                st.push(n1 + n2);
            // If operation is a number  add it
            } else {
                st.push(Integer.parseInt(operations[i]));
            }
        }
        // Calculate total sum
        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] operations = {"5", "2", "C", "D", "+"};
        int result = calPoints(operations);
        System.out.println(result);
    }
}