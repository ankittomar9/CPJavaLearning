package dsa_advance.arrays_2d;
import java.util.Arrays;
public class Q_34_Largest_In_Each_Row {
    public static void main(String args[]){
        int arr[][]={{1,2,3},{15,8,9},{-1,-5,-3}};
        System.out.println("Original Array : \n"+Arrays.deepToString(arr));
        int result[]=findLargestInRows(arr);
   System.out.println("Largest in each row: " + Arrays.toString(result));
        
    }
    public static int[] findLargestInRows(int arr[][]){
        if(arr==null || arr.length==0){return new int[0];}

        int n=arr.length;
        int result[]=new int[n];
        
        for(int i=0;i<n;i++){
            int m=arr[i].length;
            if(m==0) continue;
            int currentMax=arr[i][0];

            for(int j=0;j<m;j++){
                if(arr[i][j]>currentMax){
                    currentMax=arr[i][j];
                }
            }
            result[i]=currentMax;
        }
        return result;
    }
}
