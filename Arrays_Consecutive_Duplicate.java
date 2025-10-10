import java.util.Arrays;

public class Arrays_Consecutive_Duplicate {
    public static void main(String args[]){
        int arr[]={1,2,3,3};
      //     int arr2[]={1,2,5,1,5,1};
        boolean isDuplicate=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                isDuplicate=true;
            }
        }
        if(isDuplicate==true){
            System.out.println("Yes Consecutive duplicate in array\n" +Arrays.toString(arr));
        }else{
            System.out.println("No Consecutive duplicate in array\n" +Arrays.toString(arr));
        }

    }
}
/*
 to check if the given array A has consecutive duplicate elements or not.
 */