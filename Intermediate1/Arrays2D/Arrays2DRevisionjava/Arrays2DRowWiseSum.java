public class Arrays2DRowWiseSum {
    public static void main(String args[]){
            int arr[][]={{1,2,3,1},
                        { 4,5,6,1},
                         {7,8,9,2}};
               int n=arr.length;
               int m=arr[0].length;  int sum=0;
            for(int i=0;i<n;i++){
                sum=0;
                for(int j=0;j<m;j++){
                    sum=sum+arr[i][j];
                  
                }
                   System.out.print(" "+sum);
            }

           // System.out.println(sum);
    }
    
}
