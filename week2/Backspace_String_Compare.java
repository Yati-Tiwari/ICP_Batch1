// package week2;

import java.util.Stack;

public class Backspace_String_Compare {

     public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != '#') {
                st1.push(ch);     // add character
            } else {
                if (!st1.isEmpty()) {
                    st1.pop();    // remove last character
                }
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch != '#') {
                st2.push(ch);
            } else {
                if (!st2.isEmpty()) {
                    st2.pop();
                }
            }
        }

        // If sizes are different, strings are not same
        if (st1.size() != st2.size()) {
            return false;
        }
        // compare characters if any char is not same then result will not same
        while (!st1.isEmpty()) {
            if (st1.pop() != st2.pop()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "ab#c"; //output should be ac as #will remove 'b' in String s and 'd' in string t
        String t = "ad#c";
        boolean ans = backspaceCompare(s, t);
        System.out.println(ans);
    }
}