package com.pravin.mappract;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class HashTableDemo 
{
	public static void main(String args[])
	{
		Map mp=new Hashtable();
		mp.put(1,"Hello");
		mp.put(2, 8);
		mp.put(3, 4);
		mp.put(4, 8);
		
		System.out.println(mp);
		System.out.println(mp.get(1));
		System.out.println(mp.get(4));	
		
		Map prio=new Properties();
		prio.putAll(mp);
		System.out.println(prio);
		
		
		Map hm=new HashMap(mp);
		System.out.println(hm);
		
		Map lhm=new LinkedHashMap(hm);
		System.out.println(lhm);
		
		SortedMap tree=new TreeMap(hm);
		System.out.println(tree);
		
		Map idmp=new IdentityHashMap(mp);
		System.out.println(idmp);
		
		Map wekmp=new WeakHashMap(mp);
		System.out.println(wekmp);
		
//		for(Object n:mp)
//		{
//			System.out.println(n);
//		}
		
	}

}
