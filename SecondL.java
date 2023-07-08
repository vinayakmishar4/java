import java.util.Scanner;

public class SecondL
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
       System.out.println("Second Maximum element in the array :-");
       int max =Integer.MIN_VALUE;
       int Smax = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++)
        {
           if(arr[i]>max)
           {
              Smax=max;
              max=arr[i];
           }
           else if(arr[i]!=max && arr[i]>Smax)
           {
              Smax=arr[i];
           }
        }
        System.out.println(Smax);   
   } 
}
