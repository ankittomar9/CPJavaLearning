import java.util.Arrays;
import java.util.Scanner;

public class ArraysSearchElement {
    public static void main(String args[]){
        int arr[]={1,8,7,6,1,2,4,5,6,8,9,3,6,1,8};
        Scanner  scn=new Scanner(System.in);
            int n=scn.nextInt(); int count=0;
            int arr_Index[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==n){
              //  System.out.println(arr[i]);
              arr_Index[i]=i;
                count++;
            }

        }
     System.out.println("Element appear at indexes : ");
     System.out.println(Arrays.toString(arr_Index));   // use a full loop and if condition to remove zeroes in answer
     System.out.println("total appearance : "+count);

    }
    
}

/*
 * Linear Search with occurence count
 * 
 */