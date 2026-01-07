package dsa_advance.array;

import java.util.Arrays;

public class Q_10_Arrays_Separate_Odd_even {
    public static void main(String args[]){
        int nums[]={1,10,5,1,3,15,6,12};
        int even_nums[]=new int[nums.length];
         int odd_nums[]=new int[nums.length];

         for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even_nums[i]=nums[i];
            }else{
                 odd_nums[i]=nums[i];
            }
         }

         System.out.println("Original Array : \n "+Arrays.toString(nums));
         System.out.println("Even Array : \n "+Arrays.toString(even_nums));
         System.out.println("Odd Array : \n "+Arrays.toString(odd_nums));

         //Note if you don't want Zeroes in array print
         //Either use Arraylist 
         //Or first count even and odd elements length
         //Run two separate loop to count and add the element

    }
    
}
