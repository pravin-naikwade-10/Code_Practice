package com.utility;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Word_From_Array {
	
	public static void main(String[] args) {
		
		String arr[]={"an","event","for","the","Improvements", "for","the","first","time"};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i].equals(arr[j]))
				{
					System.out.println("duplicate word: "+ arr[i]);
				}
			}
		}
		
		System.out.println("-------------------------------------------");
		
		Set<String> set=new HashSet<String>();
		for(String word:arr)
		{
			if(set.add(word) == false)
			{
				System.out.println("duplicate word: "+ word);
			}
		}
		
		
	}

}
