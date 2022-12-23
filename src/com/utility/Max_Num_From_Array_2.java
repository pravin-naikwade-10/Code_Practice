package com.utility;

import java.util.Arrays;

public class Max_Num_From_Array_2 {
	
	public static void main(String[] args) {
		int arr[]= {2,2,3,1,3,-9,-1,4,8,-6,6};		
		
		System.out.println("get_Large_Num: "+get_Large_Num(arr));
		System.out.println("get_Large_Num_Without_Inbuid_Functions: "+get_Large_Num_Without_Inbuid_Functions(arr));
		System.out.println("get_Large_num_without_Sorting: "+get_Large_Num_without_Sorting(arr));
	}
	public static int get_Large_Num_Without_Inbuid_Functions(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			for(int k=0;k<arr.length;k++)
			{
				//System.out.print(arr[k]+",");
			}
			//System.out.println();
		}	
		//System.out.println(arr[arr.length-1]);
		
		for(int i=0;i<arr.length;i++)
		{
			//System.out.print(arr[i]+",");
		}
		return arr[arr.length-1];
	}
	
	public static int get_Large_Num_without_Sorting(int arr[])
	{
		int max=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}	
		return max;
	}
	public static int get_Large_Num(int arr[])
	{
		Arrays.sort(arr);
		
		return arr[arr.length-1];
	}
}
