package BasicDSAImplemetations.Array;

import java.util.Arrays;

public class Q_11_Delete_an_element_from_array {
    public static void main(String args[]){
        int nums[]={10,20,30,40,50};
        // Do we have an index where to delete no we don't Find index first;
        //Delete 30 from array
        // do we want remove the element and replace it like with null like in database
        //or we want to delete and  the array like 10 20 40 50 //in next question

        //let 's do both
        int index=0; int elementTodelete=30;  
        for(int i=0;i<nums.length;i++){   // Index found
            if(nums[i]==elementTodelete)
             index=i;   
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[index]){
              nums[i]=-1;  // this is not allowed we mark -1 for things not exists
            }
        }

        System.out.println(" "+Arrays.toString(nums));
      
        
    }
    
}
