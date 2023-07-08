import java.util.Scanner;

public class Smin 
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
       System.out.println("Second Minimum element in the array :-");
       int min=Integer.MAX_VALUE;
       int Smin= Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
        {
           if(arr[i]>min)
           {
              Smin=min;
              min=arr[i];
           }
           else if(arr[i]!=min && arr[i]>Smin)
           {
              Smin=arr[i];
           }
        }
        System.out.println(Smin); 
   } 
}
