import java.util.Scanner;

public class Max 
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
       System.out.println("Maximum element in the array :-");
       int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
   } 
}
