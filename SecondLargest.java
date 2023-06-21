public class SecondLargest 
{
   public static void main(String[] args) 
   {
       int arr[]={1,2,3,4,5,6,7,8,9,10,11};
       int frist=arr[0];
       int second=-1;
       for(int i=0;i<arr.length;i++)
      {
         if(arr[i]>frist)
         {
            frist=i;
         }
      }
      // second largest
      for(int i=0;i<arr.length;i++)
      {
       if(arr[i]!=arr[frist])
       {
         if(second==-1)
         {
            second=i;
         }
         else if(arr[i]>arr[second])
         {
            second=i;
         }
       }
      }
      System.out.println(arr[frist]);
      System.out.println(arr[second]);

   }  
}
