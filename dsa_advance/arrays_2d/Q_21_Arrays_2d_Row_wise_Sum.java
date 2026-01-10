package dsa_advance.arrays_2d;

public class Q_21_Arrays_2d_Row_wise_Sum {
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        //Expected output : row 1= sum=1+2+3 = 6
        //Expected output : row 2= sum=4+5+6 = 15
        //Expected output : row 3= sum=7+8+9 = 24
        int sum=0;
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<m;j++){
                sum=sum+arr[i][j];
            }
            System.out.println("Sum of row "+i+" is : "+sum);
        }

    }
    
}
