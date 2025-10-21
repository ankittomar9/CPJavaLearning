public class ArrayList_Unique2 {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>(2,4,6,8,1,2,4,6,7,1);
        Collections.sort(list);
        System.out.println(list);
        long total_steps=0;
        int step_req=list.get(0);

        for(int i=1;i<list.size();i++){
            int New_steps=list.get(i);
        
        if(New_steps>step_req){
           step_req=New_steps; 
        }
        else{
            int total_steps=step_req+1;

        }
        
        
        
        
        }


    }
    
}
