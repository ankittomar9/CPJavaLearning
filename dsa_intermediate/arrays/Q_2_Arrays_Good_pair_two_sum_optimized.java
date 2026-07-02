package dsa_intermediate.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Q_2_Arrays_Good_pair_two_sum_optimized {
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
       HashMap<Integer,Integer> map=new HashMap<>();
        int required=0;;
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            required=target-current;
            if(map.containsKey(required)){
                System.out.println("Pairs found : [ "+current+" , "+required+"] ");
                count++;
            }
            map.put(current,i);
        }


        return count;    
    }
}
