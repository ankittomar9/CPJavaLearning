import java.util.Scanner;

public class Func_VolumeOfSphere {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        double n=scn.nextDouble();

        Func_VolumeOfSphereFunc(n);
    }
    public static  void Func_VolumeOfSphereFunc(double a){
        double vol=0;

        vol=(Math.PI *a*a*a)*4/3;

        System.out.println(vol);

        System.out.println(Math.ceil(vol));
          System.out.println(Math.round(vol));
            System.out.println(Math.floor(vol));
        


    }
    
}
