import java.util.*;
public class DaysInAMonth {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();

        DaysInAMonthFunc(a);

    }

    public static void DaysInAMonthFunc(int x){
        if(x==1){
            System.out.println(" Number of days in January("+ x +") in a non-leap year = 31.");
        }
        else if(x==2){
                        System.out.println(" Number of days in February("+ x +") in a non-leap year = 28.");
        }
        else if(x==3){
                        System.out.println(" Number of days in March("+ x +") in a non-leap year = 31.");
        }
        else if(x==4){
                        System.out.println(" Number of days in April("+ x +") in a non-leap year = 30.");
        }
        else if(x==5){
                        System.out.println(" Number of days in May("+ x +") in a non-leap year = 31.");
        }
        else if(x==6){
                        System.out.println(" Number of days in June("+ x +") in a non-leap year = 30.");
        }
        else if(x==7){
                        System.out.println(" Number of days in July("+ x +") in a non-leap year = 31.");
        }
        else if(x==8){
                        System.out.println(" Number of days in August("+ x +") in a non-leap year = 31.");
        }
        else if(x==9){
                        System.out.println(" Number of days in September("+ x +") in a non-leap year = 30.");
        }
        else if(x==10){
                        System.out.println(" Number of days in October("+ x +") in a non-leap year = 31.");
        }
         else if(x==11){
                        System.out.println(" Number of days in November("+ x +") in a non-leap year = 30.");
        }
         else if(x==12){
                        System.out.println(" Number of days in December("+ x +") in a non-leap year = 31.");
        }
        else 
         System.out.println(" invalid input");

        }
    }

