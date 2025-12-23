package BasicDSAImplemetations.SortingAlgos;
import java.util.Arrays;
public class Q_2_Selection_Sort {
    public static void main(String args[]){
       int nums[]={5,1,4,2,8};
         System.out.println("Before Sort: \n" + Arrays.toString(nums));
       // what if array is sorted
       SelectionSortFunc(nums);
       System.out.println(" After Sort :\n " + Arrays.toString(nums));
    }
    
    public static void SelectionSortFunc(int nums[]){
        int n=nums.length;

        for(int i=0;i<n-1;i++){
            int minIndex=i;
           
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[minIndex]){
                    minIndex=j;
                }
            }

            int temp=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;
        }


    }
    
}
