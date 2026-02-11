package BasicDSAImplemetations.Array;

import java.util.ArrayList;
import java.util.List;

public class Q_15_Print_Prime_numbers_from_1_to_n {
    public static void main(String args[]){
        int n=50;
        isPrimeChecker(n);
    }

    public static void isPrimeChecker(int n){
       List<Integer> list=new ArrayList();
        int factorsCount=1;
        list.add(1);
        for(int i=2;i<=n;i++){
            for(int j=i;j<=n;j++){
                if(i%j==0){
                  factorsCount++;
                }
            }
                if(factorsCount==2){
                    list.add(i);
                }
        }

        System.out.println(list);
    }
    
}
