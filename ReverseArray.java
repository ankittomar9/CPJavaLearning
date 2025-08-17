
import java.util.Arrays;

public class ReverseArray {
    public static void main(String args[]){
         int arr[]={2,5,1,4,8,0,8,1,3,8};

       //  int i=arr[0];int j=arr[arr.length-1];
       int i=0; int j=arr.length-1;  
       while(i<j){

        int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;

            i++;
            j--;
         }
         System.out.println(Arrays.toString(arr));

       for(int k=0;k<arr.length;k++){
        System.out.print(" "+arr[k]);
       }

    }
}

/**   Input   int arr[]={2,5,1,4,8,0,8,1,3,8}; 
 *  output  
 * [8, 3, 1, 8, 0, 8, 4, 1, 5, 2]
 8 3 1 8 0 8 4 1 5 2
 * 
 * 
*/