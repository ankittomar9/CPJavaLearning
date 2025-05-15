
import java.util.Scanner;

public class CountTheDigits {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();

        CountTheDigitsFunc(x);

    }
    public static void CountTheDigitsFunc(int n){
    int count=0;
    while(n>0){
        //n=n%10;
        n=n/10;
        count++;
    }
       System.out.println(count);
}
}

/* */