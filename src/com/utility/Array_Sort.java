package com.utility;

public class Array_Sort {
	
	public static void main(String[] args) {
		
		int[] num_arr = new int[] {0,6,3,4,0,5,0,6,9,0,1};
	//sort Array
		//int new_arr[]=sort_Array(num_arr);
		//for(int k=0;k<new_arr.length;k++)
		//{
		//	System.out.print(new_arr[k]+",");
		//}
		System.out.println();
	//place all '0' in front
		int new_arr_2[]=arrange_Zeros(num_arr);
		for(int k=0;k<new_arr_2.length;k++)
		{
			System.out.print(new_arr_2[k]+",");
		}
	}
	public static int[] sort_Array(int[] arr)
	{
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            int tmp = 0;
	            if (arr[i] > arr[j]) {
	                tmp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = tmp;
	            }
	        }
	    }
	    
	    return arr;
	}
	public static int[] arrange_Zeros(int arr[])
	{
		int counter=arr.length-1;
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=0)
			{
				arr[counter]=arr[i];
				counter--;
			}		
		}
		while(counter>0)
		{
			arr[counter]=0;
			counter--;
		}
		
		return arr;
	}
}
