package dsa_advance.array;
public class Q_37_Arrays_Subarray_sum_Optimized1 {
    public static void main(String args[]){
        //Subarray sum optimized using prefix sum
        int arr[]={1,2,3,4,5};
        int n=arr.length;
          int prefix_arr[]=new int[n];
          prefix_arr[0]=arr[0];
            for(int i=1;i<n;i++){
                prefix_arr[i]=prefix_arr[i-1]+arr[i];
            }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                 
                //We need to eliminate the loop
                //Aporach 1 : Using Prefix Sum
                // for(int k=i;k<=j;k++){
                //     sum=sum+arr[k];
                // }
                if(i==0){
                    sum=prefix_arr[j];
                }else{
                    sum=prefix_arr[j]-prefix_arr[i-1];
                }
               System.out.println("Subarray (" + i + "," + j + ") sum: " + sum);
            }
        }
    }
    
}

/*
TC :O(n^3) SC:O(1) original three loops
TC:O(n^2) SC:O(N) using prefix sum
*/