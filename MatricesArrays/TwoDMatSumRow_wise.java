package MatricesArrays;
public class TwoDMatSumRow_wise {
    
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
            int n=arr.length;
            int sum=0;

            for(int i=0;i<n;i++){
                 sum=0;
                for(int j=0;j<n;j++){
                sum+=arr[i][j];
              //  System.out.print(sum);git
                }
                System.out.print(sum);
                System.out.println();
            }


    }

}
