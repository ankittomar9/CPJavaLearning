public class ArraysFindTheLastOccurenceOfMinMax {
    public static void main(String args[]){
       int arr[]={1,2,3,16,5,4,16,9,16,3,4,1,7,1,3,16,10,4,5}; int a=0;int b=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

       for(int i=0;i<arr.length;i++){
         if(arr[i]>=max){   // Occurence changes with this condition first and last
            max=arr[i];
            a=i;
        }
         if(arr[i]<=min){
            min=arr[i];
            b=i;
        }

       }
            System.out.println("Found Max  at " +a+ " Value : "+arr[a]);
     
        
             System.out.println("Found Min  at " +b+ " Value : "+arr[b]);
        }
    
}
