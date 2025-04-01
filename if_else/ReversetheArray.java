package if_else;

import java.util.Arrays;

public class ReversetheArray {
    public static void main(String args[]){
       // int arr[]={1,2,3,4,5,6,7,8,9};

        int arr[]={-3,-2,6,8,4,8,5};
     //   [5, 8, 4, 8, 6, -2, -3]
     
            int temp=0;
            int i=0;
            int j=arr.length-1;

        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
