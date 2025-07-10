public class ArrayselementGreaterThanItself {
    public static void main(String args[]){
        int arr[]={2,5,1,4,8,0,8,1,3,8};
        int count=0; int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
                //max=Max(arr[i],max)
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                count++;
            }
        }
        System.out.println(" The elements are "+(arr.length-count));

    }
    
}
