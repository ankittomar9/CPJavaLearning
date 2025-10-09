import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Insert_that {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
         int arr[]={2,9,6,7,8,2,4,5,1,3,6};
         int arr1[]=new int[arr.length+1];
        int n=scn.nextInt();  // value to be inserted
        int k=scn.nextInt(); // index location where n should be inserted
        
        //copy the elements
        for(int i=0;i<k;i++){
            arr1[i]=arr[i];
             
        }
         arr1[k]=n;
      
        //copy remaining elements from k+1 position because at k value 12 which is inserted value
        for(int i=k;i<arr.length;i++){
            arr1[i+1]=arr[i];  // arr1[i+1] access the element after insertion
        }

        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Array after Insertion at k index  ");
         System.out.println(Arrays.toString(arr1));
            

    }
    
    
}


/*
 * 
12
4

Original Array 
[2, 9, 6, 7, 8, 2, 4, 5, 1, 3, 6]
Array after Insertion at k index  
[2, 69, , 7, 12, 8, 2, 4, 5, 1, 3, 6]


 */