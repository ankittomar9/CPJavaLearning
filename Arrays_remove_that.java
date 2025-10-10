import java.util.Arrays;
import java.util.Scanner;

public class Arrays_remove_that {
 public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(); // index from where value is to be deleted
        int arr[]={1,2,3,5,4,6,9,7,3,1,2,4};
        int arr1[]=new int[arr.length-1];

        //copy elements from 0 indx to n 
        for(int i=0;i<=n;i++){
            arr1[i]=arr[i];
        }

        for(int i=n;i<arr1.length;i++){
            arr1[i]=arr[i+1];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(arr1));
                
     }


}



/*Write a program N numbers array, 
A from the user and an integer X and 
print the array by deleting element at specified position X.

n=6
[1, 2, 3, 5, 4, 6, 9, 7, 3, 1, 2, 4]


[1, 2, 3, 5, 4, 6, 7, 3, 1, 2, 4]


 */