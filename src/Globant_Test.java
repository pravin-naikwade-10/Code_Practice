
public class Globant_Test {
	
	public static void main(String[] args) {
		
		String str="My name is pravin naikwade";
				String arr[]=str.split(" ");

				String value=arr[arr.length-1];
				System.out.println(value.length());
				
				int numArray[]= {2,3,4,7,5};
				
				int[] reverseArray=reverse_Array(numArray);
				for(int k=0;k<reverseArray.length;k++)
				{
					System.out.print(reverseArray[k]+",");
				}
	}
	public static int[] reverse_Array(int[] numArray)
	{
		int  temp;
		for(int i=0;i<numArray.length;i++)
		{
			for(int j=i+1;j<numArray.length;j++)
			{
				temp=numArray[i];
				numArray[i]=numArray[j];
				numArray[j]=temp;		
			}
		}
		return numArray;
	}

}
