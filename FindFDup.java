import java.util.Scanner;

public class FindFDup 
{
   
    public static void main(String[] args)
    {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter The Size of the Array");
         int n=scanner.nextInt();   
         int arr[]=new int[n];
         System.out.println("Enter The Elements");
         for(int i=0; i<n; i++)
         {
            arr[i]=scanner.nextInt();
         }
         System.out.println("Array:-");
         for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
        for(int i=0; i<arr.length-1; i++)
        {
            int temp=0;
            for(int j=i+1; j<arr.length; j++)
            {
               if(arr[i]==arr[j])
               {
                  System.out.println("Frist Dupilcate Element :-" + arr[i]);
                  temp=temp+1;
                  break;
               }
            }
            if(temp>0)
            {
                break;
            }
        }
    }  
}
