import java.util.Scanner;

public class Arrays_First_Occurence {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int arr[]={2,9,6,7,8,2,4,5,1,3,6};
        int n=scn.nextInt();
        int index=-1;
        
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==n){
                index=i;
                break;

            }
        }


        if(index!=-1){
            System.out.println("Element Exists at index "+index);
        }
        else{
            System.out.println("Element Doesn't Exists");
        }
        
    }
}




 /*
 * This program does not searches all the elements in the array 
 * and store the first index occurence of that element in Array
 * 
 * /* This program finds and reports the first occurrence of the element, stopping the search immediately using 'break'. */

