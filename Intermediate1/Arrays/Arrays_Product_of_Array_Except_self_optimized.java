package Arrays;
import java.util.Arrays;

public class Arrays_Product_of_Array_Except_self_optimized {
    public static void main(String args[]){
        int nums[]={1,2,3,4}; int n=nums.length;
        int ans[]=new int[nums.length];
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]*nums[i-1];
            
        }

        int rightProduct=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*rightProduct;

            rightProduct=rightProduct*nums[i];
        
        }

        System.out.println("Result: " + Arrays.toString(ans));
    }
    
}
