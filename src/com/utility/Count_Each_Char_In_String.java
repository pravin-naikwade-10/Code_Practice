package com.utility;

public class Count_Each_Char_In_String {

	public static void main(String[] args) {
		
	String str="hello";
	str=str.toUpperCase();
	
	for(int i=0;i<256;i++)
	{
		//System.out.println((char)i);
		int count=0;
		for(int j=0;j<str.length();j++)
		{
			if((char)i==str.charAt(j))
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("count: "+(char)i+" = "+count);
		//count=0;
		}
	}
   }
}
