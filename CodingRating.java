import java.util.*;
public class CodingRating {

        public static void main(String[] args){
            Scanner scn=new Scanner(System.in);
            double rating =scn.nextDouble();

            CodingRatingFunc(rating);
        }

        public static void  CodingRatingFunc(double rating){
            if(rating >=2100 ){
             if(rating %2 ==0){
                System.out.println("grand master");
                }else
                     System.out.println("GRAND MASTER");
            }
              else if(rating >=1900 ){
                 if(rating %2 ==0){
                  System.out.println("candidate master");
             }else
                    System.out.println("CANDIDATE MASTER");
            }
             else if(rating >=1600 ){
                if(rating %2 ==0){
                System.out.println("Expert");
                 }else
                     System.out.println("EXPERT ");
            }
             else if(rating >=1400 ){
                 if(rating %2 ==0){
                System.out.println("Pupil ");
                 }else
                     System.out.println("PUPIL ");
            }
             else if(rating <1400 ){
                 if(rating %2 ==0){
                System.out.println("Newbie ");
                 }else
                     System.out.println("NEWBIE ");
            }


        }
    
}
