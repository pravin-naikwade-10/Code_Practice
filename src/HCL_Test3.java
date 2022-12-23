
class HCL_Test3 {
    public static void main(String[] args) {
      
      int arr[]={3,5,2,7,8,4};
      
     // int temp[]=new int[arr.length];
     int temp=0;
     
      for(int i=0;i<arr.length;i++)
      {
            if(arr[i]>arr[i+1])
              {
                  temp=arr[i];
                  arr[i]=arr[i+1];
                  arr[i+1]=temp;
              }
          
      }
      System.out.println(arr[2]);
    }
}