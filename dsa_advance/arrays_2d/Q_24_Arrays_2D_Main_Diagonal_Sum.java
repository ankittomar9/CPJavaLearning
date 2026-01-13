package dsa_advance.arrays_2d;

public class Q_24_Arrays_2D_Main_Diagonal_Sum {
    public static void main(String args[]){
        //For Square Matrix nXn i==j
        //Use above math to  find the sum
        //But what if matrix is NxM and dimensions are different
        //That's a good question and we will do that in future questions

        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        //Expected output 1+5+9=15
        //Since i==j
        int n=arr1.length; int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum=sum+arr1[i][i];
        }
        System.out.println("Main Diagonal Sum : "+sum);

    }
    
}
