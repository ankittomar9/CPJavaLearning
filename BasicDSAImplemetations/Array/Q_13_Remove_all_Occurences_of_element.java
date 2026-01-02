package BasicDSAImplemetations.Array;

import java.util.Arrays;

public class Q_13_Remove_all_Occurences_of_element {
    public static void main(String args[]){
        //maintain relative order so no sorting is allowed
        int nums[]={10,30,20,30,40,50};
        if(nums.length==0){
            System.out.println("No element to remove");
        }
            int target=30;
            int writer=0;
        for(int reader=0;reader<nums.length;reader++){
            if(nums[reader]!=target){          // check if element matches in array
                nums[writer]=nums[reader];      // if not store that element
                writer++;                       // increase the index count
            }
        }
            //Full array including the last element
          System.out.println("Printing whole Array \n");
        System.out.println(Arrays.toString(nums));

        // this gave the shrink or removed data
        for(int i=0;i<writer;i++){
            System.out.print(" "+nums[i]);
        }
    }
    
}
