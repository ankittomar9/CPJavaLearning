public class TwoDMatReverseDiagonalPrintOptimized {

    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;

        for(int i=0;i<n;i++){
            System.out.println(arr[i][n-i-1]); 
            // observation important here draw it 
        }
    }
    
/*Best simple Approach 
 int i=0 int j=n-1
 
 while(i<n &&j>=0){
 System.out.println(arr[i][j]);
 i++
 j--
 */
}



