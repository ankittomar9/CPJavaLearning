package if_else;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayInRange {
    //Indexed based range subarray reverse
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
      
       // int arr[]={1,2,3,4,5,6,7,8,9};
            //reversed array [1, 2, 6, 5, 4, 3, 7, 8, 9]
            int arr[]={2,5,1,4,8,0,8,1,3,8};
            //reversed array [2, 5, 8, 0, 8, 4, 1, 1, 3, 8] (index 2 -6)   O(r-l+1)/2
        int temp=0;
        //range 2  6
        int l=scn.nextInt();
        int r =scn.nextInt();
        int i=l;int j=r;

        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
     //System.out.println(Arrays.toString(arr));
   
}
