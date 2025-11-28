
import java.util.Arrays;

public class Arrays2DMatrixTranspose1 {
    public static void main(String args[]){
        int arr[][]=  {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        Arrays2DMatrixTranspose1Func(arr);
    }

    public static void Arrays2DMatrixTranspose1Func(int arr[][]){
        int n=arr.length;int m=arr[0].length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
               
            }
        }
        System.out.print(Arrays.deepToString(arr));
       
       // System.out.println("\n"+temp);
        

    }

    
}
