import java.util.Arrays;
import java.util.Scanner;

public class ElementsAccessingInArray {

     public static void main(String args[]){
        Scanner scn=new Scanner(System.in);

        int arr[]={2,4,6,8,7,1,9,3,4,6};
        for(int i=0;i<arr.length;i++){
            System.out.print(" " +arr[i]);

        }
         System.out.println ();
        System.out.print(Arrays.toString(arr));
    }
    
}
