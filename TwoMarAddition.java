public class TwoMarAddition {
    
    public static void main(String args[]){
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
            int n=arr1.length;
            int result[][]=new int[n][n];
            
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                        result[i][j]=arr1[i][j]+arr2[i][j];
                        System.out.print(result[i][j] +" ");
                }
               // System.out.print(result[i][j]);
                System.out.println();

            }
          //  System.out.println();

    }
}
