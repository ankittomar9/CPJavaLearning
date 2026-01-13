package dsa_advance.arrays_2d;
public class Q_32_Are_Matrices_Same {
    public static void main(String args[]){
         int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
          int arr2[][]={{1,2,3},{4,10,6},{7,8,9}};

          //Two matrices are same only if arr1[i][j]==arr[i][j]
            int n=arr1.length;
            int m=arr1[0].length; 
            boolean isSame=true;
          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i][j]!=arr2[i][j]){
                    isSame=false;
                    break;
                }
            }
    }
           if(isSame==true){
             System.out.println("matrices are same");
           }   
           else{
              System.out.println("matrices are different");
           }
    }
    
}
