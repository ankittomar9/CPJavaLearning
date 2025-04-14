public class TwoDMatRectanglePrint {
    public static void main(String args[]){
        int arr[][]={{1,2,3,10},{4,5,6,11},{7,8,9,12}};
        int n=arr.length;
            int i=0; int j=0;

            while(i<n && j>=0){
                System.out.println(arr[i][j]+" ");
                i++;
                j--;
            }
    }
    
}
