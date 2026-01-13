import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rslt=new ArrayList<>();
        //Sort the array to make it easy to avoid duplicates
        Arrays.sort(nums);
        for (int i=0;i<nums.length-2; i++) {      
            // Skip duplicate values for the first number to avoid duplicate triplets
            if (i > 0 && nums[i]==nums[i-1]) {
                continue;
            }
            // Use two pointers to find pairs that sum with nums[i] to zero
            int left=i+1;            // starting pointer
            int right =nums.length-1;   // End pointer at the last element
            //Move pointers inward until they meet
            while (left < right) {
                int sum=nums[i]+nums[left]+nums[right];
                if (sum==0) {
                    // Found a valid triplet
                    rslt.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    // Skip duplicate values for left pointer
                    while (left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    // Skip duplicate values for right pointer
                    while (left < right && nums[right] == nums[right-1]){
                        right--;
                    }

                    // Move both pointers inward after the triplet
                    left++;
                    right--;
                } else if (sum < 0) {
                    // If sum is too smallmove left pointer to increase sum
                    left++;
                } else {
                    // If sum is too large  move right pointer to decrease sum
                    right--;
                }
            }
        }
        return rslt;
    }
}