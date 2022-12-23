package com.utility;

public class Count_Char_In_String 
{
	public static void main(String[] args) {
		
		String str="Pravin Naikwade";
		
		char arr[]=str.toCharArray();
		int count=0;
		char match='a';
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==match)
			{
				count++;
			}
		}
		System.out.println("count: "+count);
	}
}
