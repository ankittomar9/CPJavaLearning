package BasicDSAImplemetations.HashMaps;
import java.util.HashSet;
/*A number is called "Colorful" if the product of 
every contiguous subsequence of its digits is entirely distinct. */
public class Q_22_Colorful_Number {
    public static void main(String args[]){
        int num1=234;
        System.out.println("Checking number: " + num1);
        System.out.println("Is Colorful ? " + isColorful(num1) + "\n");

           int num2=326;
        System.out.println("Checking number: " + num2);
        System.out.println("Is Colorful ? " + isColorful(num2) + "\n");
    }
    public static boolean isColorful(int num){
        char digits[]=String.valueOf(num).toCharArray();
        HashSet<Integer> set= new HashSet<>();

        for(int i=0;i<digits.length;i++){
            int currentProduct=1;
        
            for(int j=i;j<digits.length;j++){
                int numericValue=digits[j]-'0';

                currentProduct=currentProduct*numericValue;

                if(!set.add(currentProduct)){
                    return false;
                }
            }
        }   
        return true;
    
    }
}
