public class AGpairOptimized {
    public static void main(String args[]){

        String s ="'b','c','a','g','g','a','a','g'";
       // String s1="bcaggaag";
       // String s2="acgdgag";
       // String s3="abegag";

        int countOFa=0;        int ans=0; // number of g that can form pair

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                countOFa++;
            }
            if(s.charAt(i)=='g'){
               ans=ans+countOFa;  // this g can form the pair of.
            }
        }
            System.out.println("Pair of AG count optimized : "+ans);

    }
    
}
/*

 Pair of AG count optimized : 5
 */