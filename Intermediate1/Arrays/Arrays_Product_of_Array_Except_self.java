package Arrays;

import java.util.Arrays;

public class Arrays_Product_of_Array_Except_self{
    public static void main(String args[]){
        int nums[]={1,2,3,4};
        
    //for example i/p 1 2 3 4 exclude nums[i]
    // o/p  24 12 8 6
    // i=0  2*3*4 =24
    // i=1  1*3*4 =12
    //i=2   1*2*4  = 8
    // i=3  1*2*3 =6
        int ans[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            ans[i]=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                   ans[i]= ans[i]*nums[j]; 
                }
            }
        }
        System.out.println(Arrays.toString(nums));
         System.out.println(Arrays.toString(ans));

 
    }
    
}
