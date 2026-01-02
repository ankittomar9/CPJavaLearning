package BasicDSAImplemetations.Array;
import java.util.Arrays;

public class Q_12_Delete_the_element_and_Shrink {
  
    public static void main(String args[]){
        // This is foraceful shrink think i know why
        int nums[]={10,20,30,40,50,60};
          System.out.println(Arrays.toString(nums));
        int index=0; int elementToDelete=30;
        int logical_Size=nums.length;

        for(int i=0;i<logical_Size;i++){
            if(nums[i]==elementToDelete){
                index=i;
            }
        }
          System.out.println(index);
            logical_Size= logical_Size-1;

        for(int j=index;j<logical_Size;j++){
              nums[j]=nums[j+1];
        }
        //we are just not printing the original size array now in this 
       for(int i=0;i<logical_Size;i++){
        System.out.print(" "+nums[i]);
       }
      
    }
}
    

