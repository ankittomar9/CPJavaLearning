package BasicDSAImplemetations.Array;
import java.util.Arrays;
public class Q_6_Array_Reverse_the_array {
    public static void main(String args[]){
        //
        // This is optimized  Q_6_Array_Reverse_the_array
        int nums[]={ 10,20,30,40,50,60,70};
            System.out.println("Originaal Array \n "+Arrays.toString(nums));
            int i=0;int j=nums.length-1;
            while(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            for(int variable: nums){
                 System.out.print(variable+" "); // Three Printing Mechanisms
            }
              System.out.print("\n Copied array printed \n");
            for(int a=0;a<nums.length;a++){
                System.out.print(nums[a]+" ");
            }
               }
    }
