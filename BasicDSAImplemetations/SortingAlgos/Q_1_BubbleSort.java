package BasicDSAImplemetations.SortingAlgos;
import java.util.Arrays;
public class Q_1_BubbleSort {
    public static void main(String args[]){
        int nums[]={5,1,4,2,8};
        //what if array is sorted
          System.out.println("Before sorting : "+Arrays.toString(nums));
          BubbleSortFunc(nums);
          System.out.println("after sorting : "+Arrays.toString(nums));
        }
             public static void BubbleSortFunc(int nums[]){
        int n=nums.length;
            boolean swapped=false;
          for(int i=0;i<n-1;i++){   // why n-1 because n will give overflow  discuss this 
            for(int j=0;j<n-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                swapped=true;
            }
            if (swapped == false) {
                System.out.println("Array is sorted! Stopping early at pass: " + i);
                break; 
            }
      
        }     
      
           

    }
    
}
