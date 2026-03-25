package dsa_advance.arrays_2d;

public class Q_33_1_Wave_Print_Row {
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12}};
     
        System.out.println("Row-Wise Wave Print:");
        wavePrintRowWise(arr);
    }
    public static void wavePrintRowWise(int arr[][]){
        if(arr==null ||arr.length==0){return;}
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j=m-1;j>=0;j--){
                      System.out.print(arr[i][j]+" ");
                }
            }
        }
          System.out.println();
    }
}
