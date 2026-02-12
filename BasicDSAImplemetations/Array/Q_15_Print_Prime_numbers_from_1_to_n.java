package BasicDSAImplemetations.Array;
import java.util.ArrayList;
import java.util.List;
public class Q_15_Print_Prime_numbers_from_1_to_n {
    public static void main(String args[]){
        int n=50;
        isPrimeChecker(n);
    }
    public static void isPrimeChecker(int n){
       if(n<0){
            System.out.println("Negative Input is not allowed");
        }
        List<Integer> list=new ArrayList<>();

        for(int i=2;i<=n;i++){
             int factorsCount=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                  factorsCount++;
                }
            }
                if(factorsCount==2){
                    list.add(i);
                }
        }
          System.out.println("Prime numbers between 1 to "+n+" is \n");
        System.out.println(list);
    }    
}
/* TC : O(n^2)
SC :    O(n) Arraylist used for storing and printinh the elements */