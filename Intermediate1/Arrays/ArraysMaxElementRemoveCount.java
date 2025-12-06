
import java.util.ArrayList;
import java.util.List;

public class ArraysMaxElementRemoveCount {
    public static void main(String args[]){
        int arr[]={2,4,3,1,5}; int b=3;
        int NoOfOperationsCount=0;
        List<Integer> list = new ArrayList<>();
        boolean is_present=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>b){
                NoOfOperationsCount++;
               list.add(i);
            }
            if(arr[i]==b){
                is_present=true;
            }
        }
        if(!is_present){
            System.out.println("B doesn't exists in array " );
        }
        
        System.out.println("Number of operations required : "+
        NoOfOperationsCount);
        System.out.println("Locations needed to update : "+list);

    }
    
}
