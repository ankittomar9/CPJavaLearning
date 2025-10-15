import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Printing {

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        
        ArrayList<Integer> arr=new ArrayList<>();
         ArrayList<Integer> arr2=new ArrayList<>();
        int count=scn.nextInt();

        arr.add(10);
        arr.add(20);
        arr.add(30);

        for(int i=0;i<arr.size();i++){
         //   System.out.println(arr);

        }

        System.out.println(arr);

         for(int i=0;i<count;i++){
            int value=scn.nextInt();
            arr2.add(value);
         //   System.out.println(arr);

        }
          System.out.println(arr2);

    }
    
}
