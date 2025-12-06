
import java.util.ArrayList;
import java.util.List;

public class ArraysSearchElement {
    public static void main(String args[]){
     int arr[]={1,4,6,7,8,1,6,9,4,5,2,6,4,7};
     int k=4;
     SearchElementFunc(arr,k);
     
    }
    public static  void  SearchElementFunc(int arr[],int k){
       List<Integer>list=  new ArrayList<>();
           for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                list.add(i);
            }
            
           }
           System.out.println(list);


    }
    
}
