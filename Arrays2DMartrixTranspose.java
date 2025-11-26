
import java.util.Arrays;

public class Arrays2DMartrixTranspose {
    public static void main(String args[]){
        int arr[][]={   {1,2,3},
                        {4,5,6},
                        {7,8,9}};
   

    int n=arr.length;
    int m=arr[0].length;
        int resultant[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                resultant[j][i]=arr[i][j];
            }
        }

    System.out.println(Arrays.deepToString(arr));
     System.out.println(Arrays.deepToString(resultant));



     }
}
