package com.pravin.collectionpract;

import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo1 {
	public static void main(String[] args) 
	{
		Set s1=new HashSet();
		s1.add("Hello");
		s1.add(8);
		s1.add(4);
		s1.add(3);
//		System.out.println(s1);
		
		Set<Integer> s2=new LinkedHashSet<Integer>(s1);
//		System.out.println(s2);
		
		Set<Integer> s3=new TreeSet<Integer>(s1);
		System.out.println(s3);
		
		for(Object n:s3)
		{
			System.out.println(n);
		}
	}

}
