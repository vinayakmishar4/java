package Pattern;

import java.util.Scanner;

public class P15
{
   public static void main(String[] args) 
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The number");
      int n=sc.nextInt();
      for(int i=1; i<=n; i++)
      {
        for(int j=1; j<=n; j++)
        {
            if(i>=n-2 && j>=n-2 && i<=n-1 && j<=n-1)
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print("*");
           }
        }
        System.out.println();
      }       
   }    
}
