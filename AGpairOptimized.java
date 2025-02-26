public class AGpairOptimized {
    public static void main(String args[]){

        String s ="'b','c','a','g','g','a','a','g'";
       // String s1="bcaggaag";

        int count=0;        int ans=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count++;
            }
            if(s.charAt(i)=='g'){
               ans=ans+count;
            }
        }
            System.out.println("Pair of AG count optimized : "+ans);

    }
    
}
