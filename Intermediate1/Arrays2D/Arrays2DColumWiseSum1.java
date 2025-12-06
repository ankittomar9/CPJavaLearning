package Arrays2D;
public class Arrays2DColumWiseSum1 {
    public static void main(String args[]){
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}};
        ColumWiseSumFunc(arr);
    }

    public static void ColumWiseSumFunc(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
   
        for(int j=0;j<m;j++){
                 int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i][j];
        }
        System.out.println("Sum of Column "+j +" : " +sum);
    }

    }

}
