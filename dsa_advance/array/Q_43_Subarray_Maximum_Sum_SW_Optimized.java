package dsa_advance.array;

public class Q_43_Subarray_Maximum_Sum_SW_Optimized {
    public static void main(String args[]){
          int arr[]={2,1,5,1,3,2}; int n=arr.length; int k=3;//window size is fixed

                if(n==0 || n<k){
                System.out.println("-1"); return;            }
            //step1: calculate sum of first window
            int currentSum=0;
            for(int i=0;i<k;i++){
                currentSum=currentSum+arr[i];
            }
            int maxSum=currentSum;  //initially we will have 8 in max sum
        
            for(int i=k;i<n;i++){
                currentSum=currentSum+arr[i]-arr[i-k];

                if(currentSum>maxSum){
                    maxSum=currentSum;

                }
               
            }
             System.out.println("Maximum Sum (Optimized): " + maxSum);
        }
    
}
