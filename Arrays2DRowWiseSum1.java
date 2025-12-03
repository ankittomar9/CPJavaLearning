public class Arrays2DRowWiseSum1 {
    public static void main(String args[]){
        int arr[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};

       RowWiseSumCalculatorFunc(arr); 
    }
    public static void RowWiseSumCalculatorFunc(int arr[][]){
         int n=arr.length;
         int m=arr[0].length;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum=sum+arr[i][j];
            }
            System.out.println( "Sum of row "+i+" : "+sum);
        }
    }
    
}
