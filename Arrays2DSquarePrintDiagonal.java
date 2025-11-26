

public class Arrays2DSquarePrintDiagonal {
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
   //Why Because i==j so (1,1)(2,2)(3,3)

        for(int i=0;i<n;i++){
            System.out.println(arr[i][i]);

        }

    }  
    
}
