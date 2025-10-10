package Func_Practice;
import java.util.Scanner;

public class Func_FavouriteChoco{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int y=scn.nextInt();
        int z=scn.nextInt();

        Func_FavouriteChoco_func(x,y,z);

    }
        public static void Func_FavouriteChoco_func(int x,int y,int z){
            int c=x/y;

            if(c>z){
                System.out.println(z);
            }else{
                System.out.println(c);
            }

        }







}