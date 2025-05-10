import java.util.Scanner;
public class PercentageAndGrade {
    public static void main(String args[]){
         Scanner scn=new Scanner(System.in);   
         int x=scn.nextInt();
         int y=scn.nextInt();
         int z=scn.nextInt();
         int u=scn.nextInt();
         int v=scn.nextInt();

        PercentageAndGradeFunc(x,y,z,u,v);     
    }
    
    public static void PercentageAndGradeFunc(int a,int b,int c,int d,int e){
     int total=500;
     int obtain=a+b+c+d+e;
     //System.out.println(obtain);
      double  percentage=(double)obtain/total*100;// Casting is important 350/500 0.7 but integer truncates it
     //       System.out.println(percentage);

      if(percentage >=90){
        System.out.println("Grade A \n"+percentage);
      }
      else  if(percentage >=80 && percentage<90){
        System.out.println("Grade B \n"+percentage);
      }
        else  if(percentage >=70 && percentage<80){
        System.out.println("Grade C \n"+percentage);
      }
        else  if(percentage >=60 && percentage<70){
        System.out.println("Grade D \n"+percentage);
      }
        else  if(percentage >=40 && percentage<60){
        System.out.println("Grade E \n"+percentage);
      }
        else  if(percentage <40){
        System.out.println("Grade F\n"+percentage);
      }

    }
}


/*

If percentage >= 90% : Grade A
If percentage >= 80% but <90 : Grade B
If percentage >= 70% but <80: Grade C
If percentage >= 60% but <70: Grade D
If percentage >= 40% but <60: Grade E
If percentage < 40%: Grade F

 Output: 

 I/P:1 :
 50
60
70
80
90
 Output: 70 
 C

 Exp: Not required

 */