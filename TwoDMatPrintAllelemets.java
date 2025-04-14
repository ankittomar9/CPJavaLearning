public class TwoDMatPrintAllelemets {
    public static void main(String args[]){
        //int[][] mat2d={1,2,3,4,5,6,7,8,9};
        int[][] mat2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int n=mat2d.length;
           

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.print(mat2d[i][j] +" ");
            }
            System.out.println();
        }
    }
    
}
