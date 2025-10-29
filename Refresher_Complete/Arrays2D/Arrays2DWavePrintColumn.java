package Refresher_Complete.Arrays2D;
public class Arrays2DWavePrintColumn {
    
    public static void main(String args[]){
        int arr[][]={{4,1,2},{7,4,4},{3,7,4}}; //expected 4 7 3 7 4 1 2 4 4 
        int n=arr.length;
        for(int j=0;j<n;j++){
            if(j%2==0){
                for(int i=0;i<n;i++){
                System.out.print(arr[i][j]+" ");
               }
            }
            else{
                for (int i = n - 1; i >= 0; i--){
                     System.out.print(arr[i][j]+" ");
                }
            }
            

        }

    }

}


/*
 * 4 1 2
 * 7 4 4
 * 3 7 4
 * 
 * output
 * 4 7 3
 * 7 4 1
 * 2 4 4
 */