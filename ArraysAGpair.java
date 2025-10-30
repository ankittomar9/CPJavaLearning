
public class ArraysAGpair {
    public static void main(String args[]){
                                int count=0;
        String s="acgdgag";
       


       for(int i=0;i<s.length();i++){
        if(s.charAt(i)!= 'a'){
             continue;
        }
       
        for(int j=i+1;j<s.length();j++){
             if( s.charAt(j)=='g'){
                count++;
             }
        }

        
       
       }


        System.out.println(count);


        

    }
    
}
