public class ArraysMinMax {
    public static void main(String args[]){
       int arr[]={1,2,3,4,5,4,10,9,16,3,4,1}; int a=0;int b=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

       for(int i=0;i<arr.length;i++){
         if(arr[i]>max){
            max=arr[i];
            a=i;
        }
         if(arr[i]<min){
            min=arr[i];
            b=i;
        }

       }
            System.out.println("Found Max  at " +a+ " Value : "+arr[a]);
     
        
             System.out.println("Found Min  at " +b+ " Value : "+arr[b]);
        }

}
    

