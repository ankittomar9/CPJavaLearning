package Arrays;

import java.util.Arrays;

public class Arrays_Prefix_Sum_InPlace1 {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
           System.out.println(Arrays.toString(arr));
        //Since we are modifying the array original array
        
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
               System.out.println("original array modified \n");
            System.out.println(Arrays.toString(arr));
        
        

    }
    
}
