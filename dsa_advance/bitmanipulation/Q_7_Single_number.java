package dsa_advance.bitmanipulation;

public class Q_7_Single_number {
    public static void main(String args[]){
        /*Given an array of integers where every element appears twice except for one.
         Find that single one. */
         /* Approach 1: Use HashMap or Frequency Array
            Approach 2 : Sort and Comapare Adjacent Array 
          */
        int arr[]={4,1,2,1,2};
            /*
            A ^ A = 0
            A ^ 0|1 = A
            */

       int result=0;
        for(int i=0;i<arr.length;i++){
            result=arr[i]^result;  // XOR MAGIC 
        }

        System.out.println("The Unique Element is : "+result);
    }
    
}
/*
T:C is O(N)
SC: is O(1)
*/