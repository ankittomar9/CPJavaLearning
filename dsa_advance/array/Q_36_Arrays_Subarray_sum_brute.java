package dsa_advance.array;

public class Q_36_Arrays_Subarray_sum_brute {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        
        for(int i=0;i<arr.length;i++){
           
            for(int j=i;j<arr.length;j++){
                     int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                   // System.out.print(" " +sum);
                }
                 System.out.println("Subarray (" + i + "," + j + ") sum: " + sum);
            }
        }

    }
    
}
