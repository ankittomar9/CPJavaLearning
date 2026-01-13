package dsa_advance.arrays_2d;

public class Q_28_Arrays_2D_rectangular_matrix_main_diagonal_Sum {
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                    { 9,10,11,12}};
        int n=arr.length;
        int m=arr[0].length;
        
     //if we have 3x4 matrix  diaginal (0,0),()   
     int limit=Math.min(n, m);    
           int sum=0;
     for(int i=0;i<limit;i++){
        sum=sum+arr[i][i];

     }        
     System.out.println(sum);  // 1 6 11  =18 
                    
    }
    
}
