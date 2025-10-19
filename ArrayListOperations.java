import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayListOperations {
    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt(); //arrrayList size;
        List<Integer> list=new ArrayList<>();  // Empty ArrayList
        List<Integer> newlist=new ArrayList<>(List.of(5,10,15,20));
        int newInt=90;    int newInt2=10;
        for(int i=0;i<x;i++){
           // int element=scn.nextInt();
           list.add(scn.nextInt());      
        }
        System.out.println(list);

        list.remove(4);
         System.out.println(list);

         list.addAll(newlist);
          System.out.println(list);

          list.addFirst(newInt);
          System.out.println(list);

          list.addLast(newInt2);
           System.out.println(list);

    }












    
}
