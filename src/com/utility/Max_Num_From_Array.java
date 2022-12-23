package com.utility;

public class Max_Num_From_Array {
	
	public static void main(String[] args) {
		int arr[]= {4,1,5,9,7,3,-7,-9};

		int max =arr[0];
		int secondMax=arr[0];
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secondMax=max;
				max=arr[i];
			}		
			else if(arr[i]>secondMax)
			{
				secondMax=arr[i];
			}
			else if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		System.out.println("Max num:"+max);
		System.out.println("secondMax num:"+secondMax);
		System.out.println("small num:"+small);
		
	}
}
