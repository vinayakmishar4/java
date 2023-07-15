import java.util.Scanner;

public class KthLargest 
{

   public static void main(String[] args) 
   {
         Scanner in = new Scanner(System.in);
       System.out.println("Enter the size of the array");
       int size = in.nextInt();
       int arr[] = new int[size];
       System.out.println("Enter the elements of the array");
       for(int i=0;i<size;i++)
       {
          arr[i] = in.nextInt();
       }
       System.out.println("Arrays :-");
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }
       System.out.println("Enter the K the element");
       int k=in.nextInt();
       for (int i=0;i<arr.length-1;i++)
       {
         for (int j=i+1;j<arr.length;j++)
         {
            if(arr[i]>arr[j])
            {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
         if(i==k-1)
         {
           System.out.println("K Largest Element: " + arr[i]);
         }
       }
   } 
}
