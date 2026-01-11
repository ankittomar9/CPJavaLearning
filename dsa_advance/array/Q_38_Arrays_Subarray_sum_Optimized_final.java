package dsa_advance.array;

public class Q_38_Arrays_Subarray_sum_Optimized_final {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
      
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
             
                   System.out.println("Subarray (" + i + "," + j + ") sum: " + sum);
            }
           
        }
        
    }
    
}

/*
TC :O(n^3) SC:O(1) original three loops
TC:O(n^2) SC:O(N) using prefix sum
TC: O(n^2) Sc:O(1) using carry forward technique
*/