public class AGpair {
    
    public static void main(String args[]){
        String s="agrwagrggr";int count=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a'){
                continue;
            }
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)=='g'){
                    count++;
                    
                }
            }
        }
        System.out.println(count);
    }
}
