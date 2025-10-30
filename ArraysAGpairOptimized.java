public class ArraysAGpairOptimized {
    public static void main(String args[]){
      String s="bcaggaag"; 
      int n=s.length();
        int count=0;int ans=0;
       for(int i=0;i<n;i++){
        if(s.charAt(i)=='a'){
            count++;
        }
        else if(s.charAt(i)=='g'){
            ans=ans+count;
        }

       }
       System.out.println(ans);
    }
    
}



/*
 * For every 'a' -> looking for count of g on right hand side
 * for every 'g'-> looking for count of a on left hand side
 * 
 * 
 */