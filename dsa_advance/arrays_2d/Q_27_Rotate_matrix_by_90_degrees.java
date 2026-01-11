package dsa_advance.arrays_2d;
import java.util.Arrays;

public class Q_27_Rotate_matrix_by_90_degrees {
    public static void main(String args[]){
     int arr[][]={{1,2,3},
                {4,5,6},
                 {7,8,9}};
        int n=arr.length;int m=arr[0].length;             
    // step 1 : To rotate first do matrix transpose
    for(int i=0;i<n;i++){
        for(int j=i+1;j<m;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }              
    System.out.println(Arrays.deepToString(arr));

    
     System.out.println(Arrays.deepToString(arr));
    
    }

  
}
