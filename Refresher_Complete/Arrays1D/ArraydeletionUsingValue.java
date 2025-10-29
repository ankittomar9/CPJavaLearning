package Arrays1D;
import java.util.Arrays;
import java.util.Scanner;

public class ArraydeletionUsingValue {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
          int arr[]={2,9,6,7,8,2,4,5,1,3,6};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }
        }
       int arr_final[]=new int[arr.length-count];

       int i=0; int j=0;
       for( i=0;i<arr.length;i++){
        if(arr[i]!=n){
           arr_final[j]=arr[i]; 
           j++;
        }
       }

          System.out.println("Original Array before Deletion ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Array after Deletion by Value  ");
         System.out.println(Arrays.toString(arr_final));
       }

       

    }
    

/*
 * 
Original Array before Deletion 
[2, 9, 6, 7, 8, 2, 4, 5, 1, 3, 6]
Array after Deletion by Value  
[2, 9, 7, 8, 2, 4, 5, 1, 3]
 * 
 */