// package week_2.sheet2;
import java.util.*;

public class Daily_temperature {
    public static void main(String[] args){
        int[] arr={73,74,75,71,69,72,76,73};
        int[] ans=dailyTemperatures(arr);
        for(int val:ans){
            System.out.print(val+" ");
        }
    }
     public static int[] dailyTemperatures(int[] arr) {
        int[] ans=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		for(int i=ans.length-1;i>=0;i--) {
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i]=0;
			}else {
				ans[i]=st.peek()-i;
			}
			st.push(i);
		}
        return ans;
    }   
}