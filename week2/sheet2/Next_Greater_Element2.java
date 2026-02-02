package sheet2;

public class Next_Greater_Element2 {
   
     public static int[] nextGreaterElements(int[] nums) {
        //max elemnt of array dont have any next greater---> condition1
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<nums.length;i++){
            res[i]=-1;
            for(int j=1;j<nums.length;j++){
                if(nums[i]<nums[(i+j)%n]){
                    res[i]=nums[(i+j)%n];
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr= {1,2,1};
        int[] ans=nextGreaterElements(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

