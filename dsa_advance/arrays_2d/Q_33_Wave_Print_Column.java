package dsa_advance.arrays_2d;

public class Q_33_Wave_Print_Column {
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12}};
        System.out.println("Column-Wise Wave Print:");
        wavePrintColumnWise(arr);
    }
    public static void wavePrintColumnWise(int arr[][]){
        if(arr==null ||arr.length==0){return;}
        int n=arr.length;
        int m=arr[0].length;

        for(int j=0;j<m;j++){
            if(j%2==0){
                for(int i=0;i<n;i++){
                    System.out.print(arr[i][j]+" ");
                }
            }
                else{
                for(int i=n-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
               
        }
     System.out.println();
    }
    
}
