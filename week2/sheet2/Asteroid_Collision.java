// package week_2.sheet2;
import java.util.*;
public class Asteroid_Collision {
    public static void main(String[] args){
         int[] arr={3,5,-6,2,-1,4};
        int[] ans=asteroidCollision(arr);
        for(int val:ans){
            System.out.print(val+" ");
        }
    }
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int a:asteroids){
             boolean des = false;
             //boolean variable for taking care of collision when nesxt upcoming element is not part of answer
            while(!st.isEmpty() && st.peek() > 0 && a < 0){ //when stack having +ve value and crrent elemnt is negative means collison is there 
                if(Math.abs(a)>Math.abs(st.peek())){
                    //when current element value greater than stack peek
                    st.pop();
                }else if(Math.abs(a)==Math.abs(st.peek())){
                    //collisoson is therie both current element and upcoming get destriyed so des==true we should not push this to stack ( not part of answer)
                    st.pop();
                    des=true;
                    break;
                }else{
                    //if peak element in stack is greater than current element than curr get destroyed so we do not push that 
                    des=true;
                    break;
                }
            }
            if (!des) {
                st.push(a); // current asteroid survived
            }
        }
        int[] res = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}
//3 conditions are there 
    //1.current is smaller than top of stack
    //2.current is equal top of stack
    //3.current is bigger than top of stack
