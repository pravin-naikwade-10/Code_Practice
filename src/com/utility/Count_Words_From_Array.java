package com.utility;

import java.util.HashMap;
import java.util.Map;

public class Count_Words_From_Array {
	
	public static void main(String[] args) {
		
		String str="GeeksforGeeks is organizing an event for the Improvements for the first time. This event is all about improving the existing GFG articles. Simply begin studying";
		
		
		Map<String, Integer> map=new HashMap<>();
		
		String arrStr[]=str.split(" ");
		
		for(String word:arrStr)
		{
			Integer count=map.get(word);
			//System.out.println("count: "+count);
			if(count == null)
			{
				map.put(word, 1);
			}
			else
			{
				map.put(word, count+1);
			}
		}
		System.out.println(map.toString());
	}

}
