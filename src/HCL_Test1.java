
import java.util.*;

class HCL_Test1 {
    public static void main(String[] args) {
        
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"ab");
        map.put(2,"cd");
        map.put(3,"gh");
        
        for(Map.Entry<Integer,String> entry:map.entrySet())
        {       
            System.out.println(entry.getKey()+ " " +entry.getValue());
        }    
        System.out.println("---------------------------------------------");
        
       //Set<Integer> set= map.keySet();
        
        for(Integer count:map.keySet())
        {
        System.out.println(count +" "+map.get(count));
        }
    }
}