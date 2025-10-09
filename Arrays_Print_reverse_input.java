import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Print_reverse_input {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();

        int arr[]=new int[x];

        for(int i=0;i<=arr.length-1;i++){
            arr[i]=scn.nextInt();
        }
         System.out.print("Original Array\n ");
        System.out.print(Arrays.toString(arr));

         System.out.print("\nReversed Array\n");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }


    }
}
