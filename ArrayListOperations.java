import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListOperations {

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt(); //arrrayList size;
        List<Integer> list=new ArrayList<>();  // Empty ArrayList

        for(int i=0;i<x;i++){
            int element=scn.nextInt();
           list.add(element); 
           
        }

        System.out.println(list);

    }
    
}
