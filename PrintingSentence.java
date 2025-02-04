import java.util.Scanner;

public class PrintingSentence {

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        String String1=scn.nextLine();  
        
        System.out.println(""+String1);

        scn.close();
    }
    
}
/*
Example Input
Input 1:
Harry loves Hagrid !
Input 2:
Hey!! I am Learning java
Example Output
Output 1:
Harry loves Hagrid !
Output 2:
Hey!! I am Learning java
 */