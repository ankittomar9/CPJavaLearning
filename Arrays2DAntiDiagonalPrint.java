public class Arrays2DAntiDiagonalPrint {
    public static void main(String args[]){

        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int i=0;int  j=n-1;
            AntiDiagonalPrinter(arr,0,n-1);

    }

    public static void AntiDiagonalPrinter(int[][] arr,int i,int j){
       int n=arr.length;
        i=0;j=n-1; 

       while(i<n && j>=0){
        System.out.println(arr[i][j]);
        
        i++;
        j--;
       }

    }
    
}
