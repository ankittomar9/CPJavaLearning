package dsa_advance.arrays_2d;

public class Q_22_Arrays_2D_Column_wise_sum {
    public static void main(String args[]){
        int arr[][]={{1,2,3,4}
                    ,{4,5,6,7},
                     {7,8,9,10}};
         //Expected output : col 1=1+4+7 sum= 12
        //Expected output : col 2=2+5+8 sum=15
        //Expected output : col 3=3+6+9 sum=18
         //Expected output : col 4=4+7+10 sum=21
   
        int n=arr.length;
        int m=arr[0].length;
        int col_sum=0;

       for(int j=0;j<m;j++){
        col_sum=0;
        for(int i=0;i<n;i++){
            col_sum=col_sum+arr[i][j];
        }
        System.out.println("Column wise sum col "+j+" is : "+col_sum);
    }


    }
    
}
