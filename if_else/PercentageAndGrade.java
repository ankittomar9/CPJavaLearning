package if_else;
import java.util.*;

public class PercentageAndGrade {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
         float a=scn.nextInt();           float b=scn.nextInt();           float c=scn.nextInt();
         float d=scn.nextInt();           float e=scn.nextInt(); 
         float maxMarks=500; 
         float totalobtained =a+b+c+d+e;

            float percent=(totalobtained/maxMarks)*100;

            if(percent>90){
                System.out.println("Grade A "+percent);
            }else if(percent>=80 && percent<90){
                System.out.println("Grade B "+percent);
            }else if(percent>=70 && percent<80){
                System.out.println("Grade C "+percent);
            }else if(percent>=60 && percent<70){
                System.out.println("Grade D "+percent);
            }else if(percent>=40 && percent<60){
                System.out.println("Grade E "+percent);
            }else if( percent<40){
                System.out.println("Grade F  "+percent);
            }


    }

    
}

/*
 60 
 50
 70
 80
 90

 Grade C 70.0


 */