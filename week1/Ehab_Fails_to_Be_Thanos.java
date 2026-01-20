import java.util.*;
public class Ehab_Fails_to_Be_Thanos {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int[] arr=new int[2*n];
	    int sum=0;
	    int curr=0;
	    for(int i=0;i<2*n;i++){
	        arr[i]=s.nextInt();
	        sum+=arr[i];
	        if(i<n) curr+=arr[i];
	    }
	    int f=0;
	    if(sum-curr==curr){
	        int i=0;
	        int j=2*n-1;
	        while(i<n){
	            if(arr[i]!=arr[j]){
	                int temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	                f=1;
	                break;
	            }
	            i++;
	        }
	    }
	    if(f==0 && sum-curr==curr){
	        System.out.println(-1);
	    }
	    else{
    	    for(int i=0;i<2*n;i++){
    	        System.out.print(arr[i]+" ");
    	    }
	    }
	}
}