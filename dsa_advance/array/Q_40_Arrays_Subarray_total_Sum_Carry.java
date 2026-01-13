package dsa_advance.array;

public class Q_40_Arrays_Subarray_total_Sum_Carry {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        long total_Sum=0;

        for(int i=0;i<arr.length;i++){
             int sum =0;
            for(int j=i;j<arr.length;j++){
                   
                    sum=sum+arr[j];
               System.out.println("Subarray (" + i + "," + j + ") sum: " + sum);
                      total_Sum=total_Sum+sum;
            }
             
          
        }
       System.out.println("Total Sum is : \n"+total_Sum);
    }
    
}
