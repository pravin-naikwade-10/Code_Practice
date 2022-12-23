package com.utility;

import java.util.ArrayList;

public class Test_Array {
	
	public static void main(String[] args) {
		
		/*
		 * String str="Pravin"; 
		 * char[] ab =str.toCharArray(); 
		 * String temp="";
		 * 
		 * System.out.println(str.length()); 
		 * 
		 * for(int i=str.length()-1;i>=0;i--) {
		 *  
		 * temp=temp+ab[i]; 
		 * //System.out.println(temp); 
		 * }
		 * 
		 * System.out.println(temp);
		 */
		
		int arr[]= {4,3,8,5,7};
		
		int max=0;
		
		for(int  i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		
		//demo();
		
	}
	
	public static void demo()
	{
		ArrayList<String> templist=new ArrayList<String>();
		
		templist.add("a");
		templist.add("b");
		templist.add("c");
		templist.add("d");
		/*
		 * for(String st:templist) { System.out.println(st); }
		 */
		System.out.println("size: "+templist.size());
		
		for(int i=0;i<templist.size();i++)
		{
			System.out.print(templist.get(i));
		}
	}

}
