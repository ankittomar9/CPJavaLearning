
public class Arrays2DAre2Matrices {
    public static void main(String args[]){

        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int barr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int carr2[][]={{1,2,3},{1,2,3},{1,2,3}};
            int n=arr.length;
            int m=arr[0].length;
            boolean areSame = true;

          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]!=barr1[i][j]){
              //      System.out.print(" "+arr[i][j] +" "+ barr1[i][j]);
               areSame = false;
               break;
                }
                if (!areSame) {
                break; // Stop checking outer loop
            }
             //    System.out.print("\n");
            }
          }

        if (areSame) {
            System.out.println("Given two matrices are SAME (Element-by-Element)");
        } else {
            System.out.println("Given two matrices are NOT same (Content mismatch)");
        }

       // boolean areEqual = Arrays.deepEquals(arr, barr1);



    }
  
}
