package dsa_advance.array;

public class Q_2_Arrays_Good_pair_two_sum_brute {
    public static void main(String args[]){
        //Find pairs which follows this arr[i]+arr[j]==target
        int nums[]={1,2,3,4,4,5};
        int target=7; 
        System.out.println("Pairs are : ");

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                 if(nums[i]+nums[j]==target){
                    System.out.println("{"+nums[i]+" , " + nums[j] +"}");

            }
        }

    }



    }
    
}
