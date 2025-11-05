public class ArraysMinMax {
    public static void main(String args[]){
        int arr[]={5,1,7,8,3,9,7,4,6,3,1};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];

            }
            else if(arr[i]<=min){
                min=arr[i];
            }   
    }
    System.out.println("min value in array : "+min);
        System.out.println("max value in array : "+max);

    }
    
}
