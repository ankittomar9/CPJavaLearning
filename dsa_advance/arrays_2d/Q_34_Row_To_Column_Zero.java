package dsa_advance.arrays_2d;

public class Q_34_Row_To_Column_Zero {
    public static void main(String args[]){
        int arr[][]={{1,1,1,1},{1,0,1,1},{1,1,1,0},{1,1,1,1}};
        System.out.println("Original Matrix : ");printMatrix(arr);
        setZeroes(arr);
        System.out.println("\nAfter Operations Matrix : ");printMatrix(arr);
    }
    public static void setZeroes(int matrix[][]){
        if(matrix==null || matrix.length==0){return ;}
        int n=matrix.length;int m=matrix[0].length;
        boolean firstRowZero=false;boolean firstColZero=false;

        for(int i=0;i<n;i++){
            if(matrix[i][0] ==0) firstColZero=true;
        }
        
        for(int j=0;j<m;j++){
            if(matrix[0][j] ==0) firstRowZero=true;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
          }
          
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstColZero){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
        
        if(firstRowZero){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
    }

    public static void printMatrix(int arr[][]){
        int n=arr.length;int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
             System.out.println();
        }
    }
}
