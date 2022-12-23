package com.utility;
import java.util.*;

public class CompressString {
	 
    public static void main(String []args){ 
      
       String myString = "aaabbbbbccaa"; 
       HashMap<Character,Integer> hashMap = new HashMap<>(); 
         
        for(int i=0;i<myString.length();i++){ 
            char c = myString.charAt(i); 
            if(!hashMap.containsKey(c)){ 
                int counter = 0; 
                for(int j=i;j<myString.length();j++){ 
                    if(c == myString.charAt(j)){ 
                        counter++; 
                    } 
                } 
                if(counter > 0){ 
                    hashMap.put(c,counter); 
                } 
            } 
        } 
         
        for(char c:hashMap.keySet()){ 
            System.out.print(c); 
			 System.out.print(hashMap.get(c)); 
        } 
    } 

}
