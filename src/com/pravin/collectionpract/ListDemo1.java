package com.pravin.collectionpract;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class ListDemo1 {

	public static void main(String[] args) 
	{		
		List l1=new ArrayList();
		l1.add("Hello");
		l1.add(8);
		l1.add(4);
		System.out.println(l1);
		
//		List<Integer> l2=new LinkedList<Integer>(l1);
//		System.out.println(l2);
//		
//		List<Integer> l3=new Vector<Integer>(l2);
//		System.out.println(l3);
//		
//		List<Integer> l4=new Stack<Integer>();
//		l4.addAll(l3);
//		System.out.println(l4);
		
//		Iterator<Integer> i=l1.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
		for(Object n:l1)
		{
			System.out.println(n);
		}
	}
}
