package BasicDSAImplemetations.Array;

import java.util.Arrays;

public class Q_12_Delete_an_element_from_array{
    public static void main(String args[]){
        
        int nums[]={10,20,30,40,50,60};
          System.out.println(Arrays.toString(nums));
        int index=0; int elementToDelete=30;
      

        for(int i=0;i<nums.length;i++){
            if(nums[i]==elementToDelete){
                index=i;
            }
        }
          System.out.println(index);

        for(int j=index;j<nums.length-1;j++){
              nums[j]=nums[j+1];
        }
        
        System.out.println(Arrays.toString(nums));
        //But we have 60 in this case twice at last 
    }
}