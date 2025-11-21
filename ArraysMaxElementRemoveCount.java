public class ArraysMaxElementRemoveCount {
    public static void main(String args[]){
        int arr[]={2,4,3,1,5}; int b=3;
        int NoOfOperationsCount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=b){
                NoOfOperationsCount++;
            }
        }
        
        System.out.println("Number of operations required : "+
        NoOfOperationsCount);


    }
    
}
