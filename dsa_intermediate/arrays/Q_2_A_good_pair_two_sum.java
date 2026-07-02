package dsa_intermediate.arrays;

import java.util.Arrays;

public class Q_2_A_good_pair_two_sum {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,4,5};        int target=7;    
         System.out.println("Original Array : "+Arrays.toString(nums));
         System.out.println("Total pairs are "+goodPair(nums,target));

    }
    public static int goodPair(int[] nums,int target){
        if(nums==null || nums.length==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    count++;
                }
            }
     }
        return count;    

    }

}
