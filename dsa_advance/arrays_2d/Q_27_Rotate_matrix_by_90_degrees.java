package dsa_advance.arrays_2d;
import java.util.Arrays;
public class Q_27_Rotate_matrix_by_90_degrees {
    public static void main(String args[]){
        int arr[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        int n=arr.length;int m=arr[0].length;
        //step 1: Rotate a matrix clockwise 90 we need first matrix transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=arr[i][j]; //(0,2),(2,0)
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("Matrix transpose \n\n"+Arrays.deepToString(arr));
       // Step 2: Then  we reverse the row to completely rotate it  
        for(int i=0;i<n;i++){
            int start=0; int end=n-1;

            while(start<end){
                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
            }
        }
        System.out.println("\nFinal rotation after 90 degrees\n\n"+Arrays.deepToString(arr));
    }  
}
