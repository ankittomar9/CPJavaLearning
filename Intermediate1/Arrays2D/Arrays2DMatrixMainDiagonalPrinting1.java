package Arrays2D;
public class Arrays2DMatrixMainDiagonalPrinting1 {
    public static void main(String args[]){
        int arr[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
         
            // Since i==j
              System.out.print( "Main diagonal : ");
          for(int i=0;i<arr.length;i++){
               System.out.print(" "+arr[i][i]);
          }

    }
    
}
