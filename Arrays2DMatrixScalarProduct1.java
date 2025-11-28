import java.util.Arrays;
public class Arrays2DMatrixScalarProduct1 {
    public static void main(String args[]){
        int arr[][]={
                     {1,2,3,},
                     {4,5,6},
                     {7,8,9}};
            int B=2;
            Arrays2DMatrixScalarProductFunc(arr,B);
    }
    public static void  Arrays2DMatrixScalarProductFunc(int arr[][],int B){
        int n=arr.length;
        int m=arr[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              arr[i][j]=arr[i][j]*B;
            }
        }
         System.out.println(Arrays.deepToString(arr));     
        
    }

}
