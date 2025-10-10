import java.util.Arrays;

public class Arrays_Print_Negative_numbers {
    public static void main(String args[]){
        int arr[]={5, 1, -5, 2, -8, -4 ,4 ,-1 ,0 ,-8 ,-1};
        int arr1[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
        if(arr[i]<0){
            arr1[i]=arr[i];
        }
        
        }

        System.out.println(Arrays.toString(arr));
          System.out.println();
          System.out.println(Arrays.toString(arr1));
    }
    
}


/*
 * 
[5, 1, -5, 2, -8, -4, 4, -1, 0, -8, -1]

[0, 0, -5, 0, -8, -4, 0, -1, 0, -8, -1]
 * 
 */