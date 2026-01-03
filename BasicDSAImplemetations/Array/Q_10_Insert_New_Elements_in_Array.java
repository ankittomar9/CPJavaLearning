package BasicDSAImplemetations.Array;

import java.util.Arrays;

public class Q_10_Insert_New_Elements_in_Array {
    public static void main(String args[]){
        int nums[]={10,20,30,40,50};
        System.out.println("Original Array \n"+Arrays.toString(nums));
        //Insert 99 at index 2
        int valueToInsert=99; int index=2;
        int new_nums[]=new int[nums.length+1];  int index_before_insert=0;
        //Best practice there is no best practice here this is forceful
        //  we should declare array twice the size like how ArrayList behaves.
          
        for(int i=0;i<index;i++){   // nums length=x=5  x-2  ,5-2 =3 //nums.length-index-1
            new_nums[i]=nums[i];
           index_before_insert++;
        }
        System.out.println(index_before_insert);
     //     System.out.println("Modified Array after Insertion \n"+Arrays.toString(new_nums));
        new_nums[index]=valueToInsert;  // inserted at position

        for(int i=index+1;i<new_nums.length;i++){   //new_nums length is 6
 //           System.out.println(i);
            new_nums[i]=nums[i-1];
        }
        System.out.println("Modified Array after Insertion \n"+Arrays.toString(new_nums));
        
    }
    
}
