// package ICP-26week_1;
import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        Problem6 obj = new Problem6();

        int[] nums = {3, 4, -1, 1};

        int ans = obj.firstMissingPositive(nums);
        System.out.println(ans);
    }
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        //unique values are there
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0){ //we have to find first posiitve 
                set.add(nums[i]);
            }
        }
        int i=1;
        while(true){
            if(!set.contains(i)) return i;
            i++;
        }
    }
    public int firstMissingPositive2(int[] nums) { //optimised version 
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=0 || nums[i]>n) nums[i]=n+1; // not required elements bc0z first missing postive exist b/w 1 to n
        }

        for(int i=0;i<n;i++){
                int val=Math.abs(nums[i]);
                if(val>0 && val<=n){ // to prevent out of bound conditon 
                 int idx=val-1; //idx 0 based
                if (nums[idx] > 0) {
                    nums[idx] = -nums[idx]; 
                }
             }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){ //the missing one only havennot -ve value 
                return i+1;
            }
        }
        return n+1;
    }
}