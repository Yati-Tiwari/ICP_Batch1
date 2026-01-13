public class Problem3 {
   
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int p1=0;
        int p2=0;
        int[]ans=new int[m+n];
        int i=0;
        while(p1<m && p2<n){
            if(nums1[p1]<nums2[p2]){
                ans[i]=nums1[p1];
                i++;
                p1++;
            }else{
                ans[i]=nums2[p2];
                i++;
                p2++;
            }
        }
        while(p1<m){
            ans[i]=nums1[p1];
            i++;
            p1++;
        }
        while(p2<n){
            ans[i]=nums2[p2];
            i++;
            p2++;
        }
        int s=ans.length;
        if(s%2==1){
            return ans[s/2];
        }else{
            return (ans[s/2]+ans[(s/2)-1])/2.0;
        }
    }
}

