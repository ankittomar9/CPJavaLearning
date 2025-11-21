
import java.util.ArrayList;

public class Arrays_Separate_Odd_Even {
    public static void main(String args[]){
        int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 12};
        ArrayList<Integer> list1=new  ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                list1.add(arr[i]);
            } if(arr[i]%2!=0){
                list2.add(arr[i]);
            }
        }

        System.out.println("Even number are: "+list1);
        System.out.println("Odd number are: "+list2);
    }
    
}
