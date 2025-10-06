import java.util.Scanner;

public class WL_count_digits {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
       

      
        while(t>0){

                 int n=scn.nextInt();
                  int count=0;
                while(n>0){
           
          //  n=n%10;  // i get the last element
            
            count++;
            n=n/10;
        }

        System.out.println(count);
        t--;
    }

        }

        
    
}
