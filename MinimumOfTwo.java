
import java.util.Scanner;

public class MinimumOfTwo {

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);

        int x=scn.nextInt();
        int y=scn.nextInt();

        if(x>y){
            System.out.println(+x+" is bigger than  : "+y);
        }else{
            System.out.println(+y+"y is bigger than x :"+x);
        }
    }
}

/*

3 4
4

6  8
8
 */