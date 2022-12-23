package com.utility;
import java.util.*;

public class CompressString_2 {

	public static void main(String[] args) {
		
		String myString = "aaaddddbbbbbcc";
		
		Map<Character,Integer> map=new HashMap<>();
			
		char arr[]=myString.toCharArray();
		for(char ch:arr)
		{
			Integer count=map.get(ch);
			
			if(count == null)
			{
				map.put(ch, 1);
			}
			else
			{
				map.put(ch, count+1);
			}
		}
		
		System.out.println(map.toString());
		
		for(char char_new:map.keySet())
		{
			System.out.print(char_new);
			System.out.print(map.get(char_new));
		}
	}
}
