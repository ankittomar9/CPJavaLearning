package basicDSAImplemetations.SortingAlgos;
import java.util.Arrays;
public class Q_3_Insertion_Sort {
    public static void main(String args[]){
        int arr[]={5,1,4,2,8};
        System.out.println("Before Sorting"+Arrays.toString(arr));
        InsertSortFunc(arr);
        System.out.println("After Sorting"+Arrays.toString(arr));

    }
    public static void InsertSortFunc(int[] nums){
        int n=nums.length;

        for(int i=1;i<n;i++){
            int key =nums[i];
            int j=i-1;

            while(j>=0 && nums[j]>key){ 
                nums[j+1]=nums[j];
                j=j-1;
            }
            nums[j+1]=key;
        }
    }
    
}
