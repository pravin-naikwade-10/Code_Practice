package com.pravin.collectionpract;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Deque;
import java.util.ArrayDeque;

public class QueueDemo 
{
	public static void main(String[] args) 
	{
		Queue q=new PriorityQueue();
//		q.add("Hello");
		q.add(8);
		q.add(4);
		q.add(3);
		System.out.println(q);
		
		Deque<Integer> dq=new ArrayDeque<Integer>(q);
		System.out.println(dq);
		
		for(Object n:dq)
		{
			System.out.println(n);
		}
		
	}
}
