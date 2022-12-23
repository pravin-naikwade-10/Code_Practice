package com.utility;

import java.util.Arrays;

public class Angram {
 public static void main(String[] args) {
	 
	// Two strings are called anagrams 
	// if they contain same set of characters but in different order.
	
	 String s1="Mother In Law";
	 String s2="Hitler Woman";
	 
	 s1=s1.replace(" ", "");
	 s2=s2.replace(" ", "");
	 
	 s1=s1.toLowerCase();
	 s2=s2.toLowerCase();
	 
	 System.out.println(s1);
	 System.out.println(s2);
	 
	 char s1_array[]=s1.toCharArray();
	 char s2_array[]=s2.toCharArray();
	 
	 Arrays.sort(s1_array);
	 Arrays.sort(s2_array);
	 
	if(Arrays.equals(s1_array, s2_array))
	{
		System.out.println("String is Anagram");
	}
	else {
		System.out.println("Not Anagram");
	}
}
}
