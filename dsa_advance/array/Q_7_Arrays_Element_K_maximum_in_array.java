package dsa_advance.array;

import java.util.Arrays;

public class Q_7_Arrays_Element_K_maximum_in_array {
    public static void main(String args[]){
        //given an array, nums, of N integers. In a particular operation, he can set any element of the array equal to -1.
// finding out the minimum number of operations required such that the maximum element
// of the resulting array is k. If it is not possible, then return -1.
        int nums[]={2,4,3,1,5};
        int k=3; //check for k=10;

        boolean kExists=false;

        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){ // edge case
                kExists=true;
            }
           
            if(nums[i]>k){
                nums[i]=-1;
                count++;
            }
            
        }
        if(kExists==true){
             System.out.println("Minimum Operations required \n"+count);
        System.out.println(Arrays.toString(nums));
        }else{
            System.out.println("k doesn't exists in array "+"-1");
        }
}    

}
