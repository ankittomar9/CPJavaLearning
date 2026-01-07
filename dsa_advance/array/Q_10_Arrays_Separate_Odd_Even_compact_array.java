package dsa_advance.array;
import java.util.Arrays;
public class Q_10_Arrays_Separate_Odd_Even_compact_array {
    public static void main(String args[]){
        int nums[]={1,10,5,1,3,15,6,12};
        int n=nums.length; int even_length=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even_length++;
            }
        }
        int odd_length=n-even_length;
        int even_nums[]=new int[even_length];
         int odd_nums[]=new int[odd_length];

         int even_count=0;         int odd_count=0;

         for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                even_nums[even_count]=nums[i];
                even_count++;
            }else{
                 odd_nums[odd_count]=nums[i];
                 odd_count++;
            }
         }
         System.out.println("Original Array : \n "+Arrays.toString(nums));
         System.out.println("Even Array : \n "+Arrays.toString(even_nums));
         System.out.println("Odd Array : \n "+Arrays.toString(odd_nums));
    }
}
