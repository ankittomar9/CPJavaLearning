package dsa_advance.array;

public class Q_39_Arrays_Subarray_total_sum_brute {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        long total_sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<n;j++){
                       int sum=0;
                for(int k=i;k<=j;k++){
                         sum=sum+arr[k];
                          }
                                total_sum=total_sum+sum;
                 System.out.println("Subarray (" + i + "," + j + ") sum: " + sum);
            }
        }
         System.out.println("Total Sum is : \n"+total_sum);

    }
    
}
