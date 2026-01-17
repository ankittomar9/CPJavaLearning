package dsa_advance.array;

public class Q_43_Arrays_Maximum_Subarray_SW_brute {
    public static void main(String args[]){
        int arr[]={2,1,5,1,3,2}; int n=arr.length;
        int k=3; //window size is fixed
            if(n==0 || n<k){
                System.out.println("-1"); return;            }

                    int maxSum=Integer.MIN_VALUE;
                for(int i=0;i<=n-k;i++){
                      int currentSum=0;
                    for(int j=i;j<i+k;j++){
                        currentSum=currentSum+arr[j];
                    }
                    if(currentSum>maxSum){
                        maxSum=currentSum;
                    }
                       
                }
            
                System.out.println("Maximum Sum (Brute Force): " + maxSum);
    }
    
}
