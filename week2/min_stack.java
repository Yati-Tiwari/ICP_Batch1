// package week2;

import java.util.*;
public class min_stack {
    private Stack<Integer> m;
    private Stack<Integer> mini;
    // static int mini;
    public min_stack() {
       m=new Stack<>();
      mini=new Stack<>();
    }
    
    public void push(int val) {
        m.push(val);
        if(mini.isEmpty()|| mini.peek()>=val){
            mini.push(val);
        }
    }
    
    public void pop() {
       int n= m.pop();
        if(n==mini.peek()){
            mini.pop();
        }
    }
    
    public int top() {
        return m.peek();
    }
    
    public int getMin() {
        if(!mini.isEmpty()) 
        return mini.peek();
        return 0;
    }
}