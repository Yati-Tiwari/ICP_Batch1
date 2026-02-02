// package week_2.sheet2;
import java.util.*;
public class Longest_Valid_Parenthesis {
    public static int longestValidParentheses(String s) {
      Stack<Integer> st=new Stack();
      int len=0;
        st.push(-1);
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            st.push(i);
        }else{
            st.pop();
            if(st.isEmpty()){
                st.push(i);
            }else{
                len=Math.max(len,i-st.peek());
            }
        }
      }
    return len;
    }
    //approach 2
      public int longestValidParentheses2(String s) {
        int n=s.length();
        int l=0;
        int r=0;
        int ans=0; 
        //in first iteration ->2 pointer to count '('  and ')' check if l==r ohterwise reset coun to 0 when r>l
        //in second iteration-> same but constion for checking bvalid get reverse if ')' clos ecouunt less than open then its not valid 
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                l++;
            }else{
                r++;
            }
            if(l==r){
                ans=Math.max(ans,l*2);
            }else if(r>l){ // from last invalid checking if ')' count greater than open ')' count
                l=0;
                r=0;
            }
        }
        l=0;
        r=0;
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='('){
                l++;
            }else{
                r++;
            }
            if(l==r){
                ans=Math.max(ans,l*2);
            }else if(l>r){ // from last invalid checking if ( count greater than close ')' count
                l=0;
                r=0;
            }
        }

        return ans;
    }
    public static void main(String[] args){
        String s=")()())"; //ans should be 4 
        System.out.println(longestValidParentheses(s));
    }
}