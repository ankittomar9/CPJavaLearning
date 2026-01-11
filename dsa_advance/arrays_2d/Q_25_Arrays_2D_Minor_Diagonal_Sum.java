package dsa_advance.arrays_2d;
public class Q_25_Arrays_2D_Minor_Diagonal_Sum {
    public static void main(String args[]){
         int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
         int n=arr.length;            int m=arr[0].length;
          int sum=0;
       //Using Two Loops           
          for(int i=0;i<n;i++){
           for(int j = 0; j < m; j++){
                if(i+j==n-1)
                sum=sum+arr[i][j];
            }
        }
        System.out.println("Sum of Minor Diagonal : \n"+sum);
        //Using Single while Loop         //See dimensions of minor diagonal
        //(0 ,m-1),(n,m),(n-1,0)  (0,2),(1,1),(1,0)
        int i=0;int j=m-1; int new_sum=0;
        while(j>=0){
            new_sum=new_sum+arr[i][j];
            i++;j--;
        }
       System.out.println("Sum of Minor Diagonal : \n"+new_sum);
    //Using for Loop   
      int fast_Sum=0;
         for(int k=0;k<n;k++){
            fast_Sum=fast_Sum+arr[k][n-1-k];
      }
              System.out.println("Sum of Minor Diagonal : \n"+fast_Sum);
    }
 }
