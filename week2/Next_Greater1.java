// package week_2.sheet;

import java.util.*;
public class Next_Greater1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]= new int[10001];
        //we are maintianing answers ( next greater elements) in this array
        // after that we eill retrieve them in constant time for main answer
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>=st.peek()){
                st.pop();
            }
            //if stack is empty then no next greter element for that particular value exist 
            if(st.isEmpty()){
                ans[nums2[i]]= -1; //put -1 at that index so it can be accisible for nums 1
            }else{
                ans[nums2[i]]=st.peek();
            }
            st.push(nums2[i]);
        }
        int n=nums1.length;
        for(int i=0;i<n;i++){
            nums1[i]=ans[nums1[i]]; // in constnat time accesing value at that index 
        }
        return nums1;
    }
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        // Call function directly (no object)
        int[] result = nextGreaterElement(nums1, nums2);
        //Next greater elements----->
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}