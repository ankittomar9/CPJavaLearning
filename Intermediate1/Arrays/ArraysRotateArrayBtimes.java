package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysRotateArrayBtimes {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
       int arr[]={1,2,3,4};
        int n=scn.nextInt(); // 2
        
            RotateArray(arr,n);
            System.out.println(Arrays.toString(arr));

            }
    
            public static int[] RotateArray(int arr[],int n){

            int i=0; int j=arr.length-1;
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            }       
            return arr;

            }

}


/*
 * 
 * 
 * 
 */