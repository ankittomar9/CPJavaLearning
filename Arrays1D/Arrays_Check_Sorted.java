package Arrays1D;
import java.util.Arrays;

public class Arrays_Check_Sorted {
    public static void main(String args[]){
        
        int arr[]={1,2,3,4,5,6,7,8,9};
             int arr1[]={9,8,7,6,5,4,3,2,1};
             boolean isSorted=true; // Assume array IS sorted

        for(int i=0;i<arr.length-1;i++){
           if( arr[i]>arr[i+1]){
             isSorted=false;
           break;
           }
        }
         if(isSorted){
                System.out.print("Array is sorted (Ascending) \n "+Arrays.toString(arr));
              //  break;
            }else{
                System.out.print("\nArray is not sorted\n");
            }

          isSorted = true;   

        for(int j=0;j<arr1.length-1;j++){
             if(arr1[j]>arr1[j+1])
             isSorted=false;
        }
        

         if(isSorted){
                System.out.print("\n Array is  sorted \n "+Arrays.toString(arr1));
            }else{
                System.out.print("\nArray is not  sorted\n");
            }


    }
    
}

/*
 * 
Array is sorted (Ascending) 
 [1, 2, 3, 4, 5, 6, 7, 8, 9]
Array is not  sorted
 * 
 */
