public class ArraysGoodPair {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int b=7; int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==b){
                      count++;
  System.out.println("Good Pair #" + count + ": " + 
                                       "Elements (" + arr[i] + ", " + arr[j] + ")" +
                                       " at Indexes [" + i + ", " + j + "]");
                }
              
            }
        }
        System.out.println("Good Pair : "+count);
        
    }
    
}
