import java.util.Arrays;

public class Arrays_separate_Odd_Even {
    public static void main(String args[]){
        int arr[]={2,3,6,7,8,2,4,5,2,3,6};
        int even_arr[]=new int[arr.length];
        int odd_arr[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
              even_arr[i]=arr[i];  
            }
            else  if(arr[i]%2!=0){
              odd_arr[i]=arr[i];  
            }
        }

        System.out.println(Arrays.toString(even_arr));
        System.out.println();
        System.out.println(Arrays.toString(odd_arr));
    }
    
}


/*
 * 
 * 
 [2, 0, 6, 0, 8, 2, 4, 0, 2, 0, 6]

[0, 3, 0, 7, 0, 0, 0, 5, 0, 3, 0]

You have to print the odd and even elements of array A in 2 separate lines.

NOTE: Array elements should have the same relative order as in A.
 */