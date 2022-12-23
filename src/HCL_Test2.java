
import java.util.*;
class HCL_Test2 {
    public static void main(String[] args) {
        String str="automation testing";
        str=str.replace(" ", "");
        char arr[]=str.toCharArray();
        
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        
        for(char ch:arr)
        {
            Integer count=map.get(ch);
            //System.out.println(count);
            if(count == null)
            {
                map.put(ch,1);
            }
            else
            {
                map.put(ch,count+1);
            }
        }
        System.out.println(map);
    }
}